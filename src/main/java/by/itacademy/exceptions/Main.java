package by.itacademy.exceptions;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 0, 5, 8};
        for( int i = 0; i < numbers.length; i++){
            try {
                System.out.println(1 / numbers[i]);
            } catch ( ArithmeticException e ){
                System.out.println(e);
            }
        }
    }
}
