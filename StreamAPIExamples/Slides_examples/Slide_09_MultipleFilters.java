package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_09_MultipleFilters {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Original: " + numbers);
        System.out.println("\nFilter: n > 2 AND n % 2 == 0");

        numbers.stream()
                .filter(n -> n > 2)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nExplanation:");
        System.out.println("First filter -> numbers > 2");
        System.out.println("Second filter -> even numbers");
    }
}
