package other.functionalProgramming;

import java.util.Arrays;
import java.util.List;

public class DemoFunctionalProgramming {

    public static void main(String[] args) {

        List<Integer> listNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 190);

        Integer total = listNumbers
                            .stream()
                            .reduce(0, Integer::sum);

        System.out.println(total);

    }
}
