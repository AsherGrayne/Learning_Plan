package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_16_ColToList {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Ravi", "Riya");

        System.out.println("Original: " + names);

        // Filter names starting with 'R' and collect to List
        List<String> result = names.stream()
                .filter(n -> n.startsWith("R"))
                .collect(Collectors.toList());

        System.out.println("Names starting with 'R': " + result);
    }
}
