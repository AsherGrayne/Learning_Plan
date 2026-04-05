package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_17_ColToSet {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);

        System.out.println("Original (with duplicates): " + numbers);

        // Collect to Set (removes duplicates automatically)
        Set<Integer> set = numbers.stream()
                .collect(Collectors.toSet());

        System.out.println("Collected to Set (duplicates removed): " + set);
    }
}
