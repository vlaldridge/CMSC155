package Week4.Homework;

public class Homework2_4 {
    public static int NumCount(int num) {
        int count = 0;
        for (int i = 1; i < 101; i++) {
            if (i % num == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(NumCount(5));
        System.out.println(NumCount(3));
        System.out.println(NumCount(2));
        System.out.println(NumCount(1));
    }
}
