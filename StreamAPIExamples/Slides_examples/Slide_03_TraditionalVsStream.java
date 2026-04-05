package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_03_TraditionalVsStream {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Before Java 8 (Traditional Way)
        System.out.println("Traditional Way:");
        List<Integer> even = new ArrayList<>();

        for(int n : numbers) {
            if(n % 2 == 0) {
                even.add(n);
            }
        }
        System.out.println(even);


        // With Stream API
        System.out.println("\nWith Stream API:");
        List<Integer> evenStream = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();
        System.out.println(evenStream);
    }
}
