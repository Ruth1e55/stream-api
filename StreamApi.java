import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata", "Bangalore", "Hyderabad", "Ahmedabad", "Pune", "Jaipur",
                "Lucknow", "Kanpur", "Nagpur", "Patna", "Indore", "Thane", "Bhopal", "Visakhapatnam", "Pimpri-Chinchwad", "Vadodara", "Ghaziabad", "Ludhiana",
                "Coimbatore", "Agra", "Madurai", "Nashik", "Faridabad", "Meerut", "Rajkot", "Kalyan-Dombivali", "Vasai-Virar", "Varanasi", "Srinagar", "Aurangabad",
                "Dhanbad", "Amritsar", "Navi Mumbai", "Allahabad", "Ranchi", "Howrah", "Gwalior", "Jabalpur", "Gurgaon", "Vijayawada", "Jodhpur", "Raipur", "Kota", "Guwahati",
                "Chandigarh", "Solapur", "Hubli-Dharwad", "Bareilly", "Moradabad", "Mysore", "Aligarh", "Gorakhpur", "Jalandhar", "Tiruchirappalli", "Bhubaneswar", "Salem", "Warangal",
                "Mira-Bhayandar", "Thiruvananthapuram", "Bhiwandi", "Saharanpur", "Guntur", "Amravati", "Bikaner", "Noida", "Jamshedpur", "Bhilai Nagar", "Cuttack", "Firozabad", "Kochi",
                "Nellore", "Rajahmundry", "Kolhapur", "Ajmer", "Akola", "Ujjain", "Loni", "Siliguri", "Jhansi", "Ulhasnagar", "Jammu", "Sangli-Miraj & Kupwad", "Mangalore");

        // 1. Filter
        System.out.println("------------------------");
        List<String> filteredCapitals = cities.stream().filter(x -> x.startsWith("B")).toList();
        System.out.println("Filter : "+filteredCapitals);
        System.out.println("------------------------");

        // 2. Map
        System.out.println("------------------------");
        List<String> mappedCapitals = cities.stream().map(String::toUpperCase).toList();
        System.out.println("Map : "+mappedCapitals);
        System.out.println("------------------------");

        // 3. Sort
        System.out.println("------------------------");
        List<String> sortedCapitals = cities.stream().sorted().toList();
        System.out.println("Sort : "+sortedCapitals);
        System.out.println("------------------------");

        // 4. Match
        System.out.println("------------------------");
        boolean isAllCapitalsStartWithA = cities.stream().allMatch(x -> x.startsWith("A"));
        System.out.println(isAllCapitalsStartWithA);
        System.out.println("------------------------");

        // 5. Count
        System.out.println("------------------------");
        long count = cities.size();
        System.out.println(count);
        System.out.println("------------------------");

        // 6. Reduce
        System.out.println("------------------------");
        String reducedCapitals = cities.stream().reduce("", (x, y) -> x + " " + y);
        System.out.println(reducedCapitals);
        System.out.println("------------------------");

        // 7. Collect
        System.out.println("------------------------");
        Set<String> collectedCapitals = new HashSet<>(cities);
        System.out.println(collectedCapitals);
        System.out.println("------------------------");

        // 8. Parallel Processing
        System.out.println("------------------------");
        List<String> parallelProcessedCapitals = cities.parallelStream().map(String::toUpperCase).toList();
        System.out.println(parallelProcessedCapitals);
        System.out.println("------------------------");

        // 9. IntStream
        System.out.println("------------------------");
        IntStream intStream = IntStream.range(1, 10);
        intStream.forEach(System.out::println);
        System.out.println("------------------------");

        // 10. Stream.of
        System.out.println("------------------------");
        Stream<String> stream = Stream.of("A", "B", "C");
        stream.forEach(System.out::println);
        System.out.println("------------------------");
    }
}
