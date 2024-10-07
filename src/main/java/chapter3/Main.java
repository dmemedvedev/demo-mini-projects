package chapter3;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Ivan", "Dima","Alex" };
        for (int i = 0;names.length < 0;i++){
            System.out.println(names[i]);
        }
        for ( String element : names){
            System.out.println(element + " ");
        }
    }
}

