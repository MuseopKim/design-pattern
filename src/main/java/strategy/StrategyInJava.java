package strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyInJava {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(5);

        Collections.sort(numbers, (o1, o2) -> o1 - o2);

        System.out.println(numbers);
    }
}
