package Week1;
import java.util.Scanner;

public class GroupProblem {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = inp.nextInt();
        System.out.print("Enter an integer: ");
        int y = inp.nextInt();
        System.out.print("Enter an integer: ");
        int z = inp.nextInt();

        if (x <= y && y <= z && z != x) {
            System.out.println("Increasing");
        }
        else if (x >= y && y >= z & z != x) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither");
        }
    }
}