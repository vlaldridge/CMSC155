package Week6;

import java.sql.SQLOutput;

public class CourseTester {
    public static void main(String[] args) {
        Course cmsc155 = new Course("CMSC", 155, 4);
        System.out.println(cmsc155);
        Course cmsc1552 = new Course("CMSC", 155, 4);
        System.out.println(cmsc1552);
        System.out.println(cmsc155.equals(cmsc1552));
        CG_Course cmsc255 = new CG_Course("CMSC", 255, 4, "West Des Moines" );
        System.out.println(cmsc255);
        Course bio101 = new CG_Course("BIO", 101, 4, "West Des Moines");
//        CG_Course lit101 = new Course("LIT", 101, 4);

    }
}
