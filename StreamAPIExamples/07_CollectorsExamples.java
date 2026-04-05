package StreamAPIExamples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class CollectorsExamples07 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Shyam", "Ravi", "Riya");

        // Joining
        String joined = names.stream()
                .collect(Collectors.joining(", "));
        System.out.println(joined);

        // Grouping by length
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(grouped);

        // Counting
        long count = names.stream()
                .collect(Collectors.counting());
        System.out.println(count);
    }
}
