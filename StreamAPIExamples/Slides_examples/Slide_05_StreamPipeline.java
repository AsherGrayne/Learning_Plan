package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_05_StreamPipeline {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);


        List<Integer> result = numbers.stream()
                .filter(n -> n > 2)
                .map(n -> n * 2)
                .toList();

        System.out.println("Original: " + numbers);
        System.out.println("After filter(n > 2) and map(n * 2): " + result);
    }
}
