package General;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streamm {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12, 43, 12, 34, 13);
        Stream<Integer> str = list.stream().filter(n -> n % 2 == 0);
        System.out.println(str.collect(Collectors.toSet()));

    }
}
