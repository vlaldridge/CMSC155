package Week1;

public class HomeworkOne {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
//        b = (a == b++) ? b - 1 : a + 1;
        b = (a == ++b) ? b - 1 : a + 1;
        System.out.println(b);
    }
}