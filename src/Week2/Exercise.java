package Week2;

import java.text.DecimalFormat;

public class Exercise {
    public static void main(String[] args) {
        int day = 1;
        float distance = 10;
        float total = 10;
        DecimalFormat formatter1 = new DecimalFormat("#0.000");
        System.out.println("Day " + day + " distance today = " + formatter1.format(distance) + "  total = " + formatter1.format(total));
        do {
            day += 1;
            distance *= .7;
            total += distance;
            System.out.println("Day " + day + " distance today = " + formatter1.format(distance) + "  total = " + formatter1.format(total));

        }
        while (distance >= 0.1);
    }
}
