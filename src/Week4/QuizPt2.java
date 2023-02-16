package Week4;

public class QuizPt2 {
    public static int sumTheRange (int num1, int num2) {
        int total = 0;
        for (int count = num1; count <= num2; count++){
            total += count;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(sumTheRange(2, 10));
    }
}

