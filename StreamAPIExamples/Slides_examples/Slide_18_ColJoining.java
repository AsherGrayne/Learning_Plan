package StreamAPIExamples.Slides_examples;

import java.util.*;
import java.util.stream.*;

public class Slide_18_ColJoining {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ram", "Shyam", "Ravi", "Riya");

        System.out.println("Original: " + names);

        // Join strings with separator
        String result = names.stream()
                .collect(Collectors.joining(", "));

        System.out.println("\nJoined with ', ':");
        System.out.println(result);

        // Join with different separator
        String result2 = names.stream()
                .collect(Collectors.joining(" | "));

        System.out.println("\nJoined with ' | ':");
        System.out.println(result2);
    }
}
