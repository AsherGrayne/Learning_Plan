package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_10_MapExample {

    public static void main(String[] args) {

        // Square numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Original numbers: " + numbers);
        System.out.println("\nSquared numbers:");

        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
