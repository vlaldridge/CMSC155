package Week5;

import java.util.Arrays;

public class Exercise {
    public static int[] rotateArray(int[] array) {
       int saveNumber1 = array[array.length-1];
       int saveNumber2 = 0;
       for (int index = 0; index < array.length; index++) {
           saveNumber2 = array[index];
           array[index] = saveNumber1;
           saveNumber1 = saveNumber2;
       }
       return array;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 4};
        System.out.println(Arrays.toString(rotateArray(test)));
    }
}
