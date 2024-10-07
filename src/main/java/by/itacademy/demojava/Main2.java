package by.itacademy.demojava;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int max = numbers.get(0);

        for(Integer i : numbers){
            if(i > max)
                max = i;
        }
        System.out.println(max);
    }
}
