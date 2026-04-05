package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_22_StreamVsLoop {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Traditional Loop
        System.out.println("Using Traditional Loop:");
        for(int n : numbers) {
            System.out.println(n);
        }

        System.out.println("\nUsing Stream:");
        numbers.stream()
                .forEach(System.out::println);

        System.out.println("\nAdvantages of Stream:");
        System.out.println("✔ Short");
        System.out.println("✔ Readable");
        System.out.println("✔ Powerful");
    }
}
