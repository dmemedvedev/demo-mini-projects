package inerfacetask;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Dima");
        names.add("Artiom");
        names.add(0,"Vasia");
        System.out.println(names);
    }
}
