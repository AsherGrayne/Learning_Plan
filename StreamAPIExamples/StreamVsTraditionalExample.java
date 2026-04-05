package StreamAPIExamples;

import java.util.*;
import java.util.stream.*;

public class StreamVsTraditionalExample {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1,2,3,4,5,6);

// Traditional Method

        List<Integer> traditionalResult =
                new ArrayList<>();

        for(int n : numbers) {

            
            if(n % 2 == 0) {

                
                int square = n * n;

                
                traditionalResult.add(square);
            }
        }

        System.out.println("Traditional Result:");
        System.out.println(traditionalResult);



// Stream API Method

        List<Integer> streamResult =
                numbers.stream()
                        .filter(n -> n % 2 == 0) // filter
                        .map(n -> n * n)         // transform
                        .collect(Collectors.toList()); // store

        System.out.println("\nStream API Result:");
        System.out.println(streamResult);
    }
}
