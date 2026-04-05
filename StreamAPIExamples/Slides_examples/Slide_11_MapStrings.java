package StreamAPIExamples.Slides_examples;

import java.util.*;

public class Slide_11_MapStrings {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "shyam", "ravi");

        System.out.println("Original: " + names);
        System.out.println("\nConverted to uppercase:");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
