package Week4.School;

public class StudentTester {
    public static void main(String[] args) {

        Student bob1 = new Student("Bob Smith", 971);
        Student bob2 = new Student("Bob Jones", 4321);
        System.out.println(bob1.precedesById(bob2));
        System.out.println(bob2.precedesById(bob1));
//        System.out.println(bob1);
//        System.out.println(bob2);
//        bob2.changeName("Robert Jones");
//        System.out.println(bob2);
//        Student tory = new Student ("Tory Aldridge");
//        System.out.println(tory);
//        Student ryan = new Student ("Ryan Pierick");
//        System.out.println(ryan);

    }
}
