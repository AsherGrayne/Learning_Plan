package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_12_FlatMapExample {

    public static void main(String[] args) {

        // Flatten nested lists
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6)
        );

        System.out.println("Nested List:");
        System.out.println(list);

        System.out.println("\nFlattened using flatMap():");

        list.stream()
                .flatMap(l -> l.stream())
                .forEach(System.out::println);
    }
}
