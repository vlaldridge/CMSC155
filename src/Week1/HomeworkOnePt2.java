package Week1;
import java.util.Scanner;

public class HomeworkOnePt2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        String word; 	boolean done = false;
        while (done == false)
        {
            System.out.print("Input a word (Q to quit): ");
            word = input.next();
            if (word.equals("Q"))
            {done = true;}
            else {
                sum += word.length();
            }
        }
        System.out.println("You entered " + sum + " characters.");
    }
}
