package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_19_ColGroupingBy {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Ravi", "Riya", "Raj");

        System.out.println("Original: " + names);

        // Group by string length
        Map<Integer, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("\nGrouped by string length:");
        System.out.println(grouped);
    }
}
