package Week4.Homework;

public class Homework2_3 {
    public static boolean Words(String word1, String word2, String word3) {
        if (word1.compareTo(word2) <0 && word2.compareTo(word3) <0) {
            return true;}
        else if (word1.compareTo(word2) >0 && word2.compareTo(word3) >0) {
            return true;}
        else return false;
            }

    public static void main(String[] args) {
        System.out.println(Words("hard place", "man", "rock"));
        System.out.println(Words("Java", "IntelliJ", "IDE"));
        System.out.println(Words("a cup", "a slip", "a lip"));
        System.out.println(Words("this", "this", "that"));

    }

}
