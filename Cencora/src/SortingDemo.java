import java.util.*;
import java.util.stream.Collectors;

public class SortingDemo {
    public static void main(String[] args) {
        List<String> f = Arrays.asList("Apple","cherry","pineapple");
        List<String> sortedlist = f.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
        System.out.println(sortedlist);
        List<Integer> list =Arrays.asList(1,2,3,4,5);
        int n = Collections.binarySearch(list, 3);
        System.out.println(n);
        List<String> list2 = Arrays.asList("a","b","c");
        int n1 = Collections.binarySearch(list2,"a");
        System.out.println(n1);

    }
}
