package streams.api;

import java.util.stream.IntStream;

public class FunWithNumbers {

    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7, 8, 9, 10, 16, 26};
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(min < numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Old way Minimum is:: " + min);

        Integer minValue =  IntStream.of(numbers).min().getAsInt();
        System.out.println("Streams way Minimum is:: " + minValue);
    }
}
