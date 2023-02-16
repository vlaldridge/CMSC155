package Week4.Homework;

public class VotingMachineTester {
    public static void main(String[] args) {
        VotingMachine issue1 = new VotingMachine("PROP1");
        issue1.voteYes();
        issue1.voteYes();
        issue1.voteYes();
        issue1.voteYes();
        issue1.voteNo();
        issue1.voteNo();
        System.out.println(issue1);
        issue1.clearMachine();
        System.out.println(issue1);
    }
}
