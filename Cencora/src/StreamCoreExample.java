import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamCoreExample {
    public static void main(String[] args) {
        List<String> personName = new ArrayList<>();
        personName.add("Shreya");
        personName.add("Prachi");
        personName.add("Riddhi");
        personName.add("Tayanaya");
        personName.add("Gaurav");
        personName.add("Swapnil");
        personName.add("Aranav");
        System.out.println("printin person name");
        System.out.println(personName);

        personName.stream().filter((s)->s.startsWith("a")).forEach(System.out::println);

          personName.stream().filter((s)->s.startsWith("a")).map(String::toUpperCase).forEach(System.out::println);
personName.stream().sorted(Comparator.reverseOrder()).map(String::toUpperCase).forEach(System.out::println);
        System.out.println(personName);
        List<String> meninuppercase =personName.stream().sorted()
                .map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(meninuppercase);
        boolean matc = personName.stream()
                .allMatch((s)->s.startsWith("S"));
        System.out.println(matc);

        boolean atch1 = personName.stream()
                .anyMatch((s)->s.startsWith("Z"));
        System.out.println(atch1);

        boolean matc2 = personName.stream()
                .noneMatch((s)->s.startsWith("Z"));
        System.out.println(matc2);
        Optional<String> reduced = personName.stream()
                .reduce((s1,s2)->s1+"#"+s2);
        reduced.ifPresent(System.out::println);

        String fMatched =personName.stream()
                .filter((s)->s.startsWith("S")).findFirst().get();
        System.out.println(fMatched);

    }
}
