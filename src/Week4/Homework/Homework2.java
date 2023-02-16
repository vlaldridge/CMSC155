package Week4.Homework;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String num;
        boolean done = false;
        while (done == false)
        {
            System.out.print("Please enter an integer or Q to quit: ");
            num = input.next();
            if (num.equals("Q"))
            {done = true;}
            else {
                int integer = Integer.parseInt(num);
                if (integer > 10 && integer < 15) {
                    sum++;
                }
            }
        }
        System.out.println("You entered " + sum + " numbers greater than 10 and less than 15.");
    }
}
