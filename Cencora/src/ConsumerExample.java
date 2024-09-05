import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<String> names =Arrays.asList("s","p","c");
        Consumer<String> printNme = name-> System.out.println(name);
        names.forEach(printNme);
        names.forEach(System.out::println);

    }
}
