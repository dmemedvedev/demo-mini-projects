package inheritance;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(125);
        numbers.add(345);
        numbers.add(535);
        numbers.add(334);
        System.out.println(numbers);
        boolean isAdded = numbers.add(335);
        System.out.println(numbers);
        System.out.println(isAdded);
    }
}
