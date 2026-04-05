package StreamAPIExamples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class CreateStream01 {

    public static void main(String[] args) {
        // From List
        List<String> list = Arrays.asList("A", "B", "C");
        Stream<String> stream1 = list.stream();
        stream1.forEach(System.out::println);

        // From Array
        int[] arr = {1, 2, 3};
        IntStream stream2 = Arrays.stream(arr);
        stream2.forEach(System.out::println);

        // Using Stream.of()
        Stream<Integer> stream3 = Stream.of(10, 20, 30);
        stream3.forEach(System.out::println);
    }
}
