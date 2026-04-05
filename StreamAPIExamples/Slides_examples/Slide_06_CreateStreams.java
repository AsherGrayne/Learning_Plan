package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_06_CreateStreams {

    public static void main(String[] args) {

        // From List
        System.out.println("From List:");
        List<String> list = Arrays.asList("A", "B", "C");
        list.stream().forEach(System.out::println);


        // From Array
        System.out.println("\nFrom Array:");
        int[] arr = {1, 2, 3};
        Arrays.stream(arr).forEach(System.out::println);


        // Using Stream.of()
        System.out.println("\nUsing Stream.of():");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4);
        stream.forEach(System.out::println);
    }
}
