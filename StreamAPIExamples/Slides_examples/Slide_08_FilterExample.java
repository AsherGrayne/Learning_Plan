package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_08_FilterExample {

    public static void main(String[] args) {

        // Get even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println("Original numbers: " + numbers);
        System.out.println("\nEven numbers:");

        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
