package Week4;

import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of credit hours the student has earned: ");
        int hours = inp.nextInt();

        if (hours < 0) {
            System.out.println("Invalid Entry");
        }
        else if (hours < 30 && hours >= 0) {
            System.out.println("Freshman");
        }
        else if (hours < 60 && hours >= 30) {
            System.out.println("Sophomore");
        }
        else if (hours < 90 && hours >=60) {
            System.out.println("Junior");
        }
        else {
            System.out.println("Senior");
        }
    }
}
