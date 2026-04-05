package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_13_ReduceExample {

    public static void main(String[] args) {

        // Calculate sum using reduce
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        System.out.println("Numbers: " + numbers);

        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum using reduce(): " + sum);

        // Another example: Product
        int product = numbers.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product using reduce(): " + product);
    }
}
