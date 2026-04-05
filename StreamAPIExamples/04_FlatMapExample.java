package StreamAPIExamples;

import java.util.Arrays;
import java.util.List;

class FlatMapExample04 {

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4)
        );

        list.stream()
                .flatMap(l -> l.stream())
                .forEach(System.out::println);
    }
}
