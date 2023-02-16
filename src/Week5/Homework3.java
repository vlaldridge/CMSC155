package Week5;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {

    public static int[] createArray(int n, int bottom, int top) {
        int[] numbers = new int[n];
        Random randomGenerator = new Random();
        int max = top, min = bottom;

        for (int index = 0; index < n; index++) {
            numbers[index] = randomGenerator.nextInt(max - min) + min;
        }
        return numbers;
    }

    public static void main(String[] args) {
        int[] myArray = createArray(5, 10, 20);
        System.out.print(Arrays.toString(myArray));
    }
}






//    public static int addAllNumbers(int[] numbers) {
//        int arraySum = 0;
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                arraySum += number;
//            }
//        }
//        return arraySum;
//    }
//
//    public static void main(String[] args) {
//        int[] input = {1, 2, 3, 4, 5};
//        System.out.println(addAllNumbers(input));
//    }