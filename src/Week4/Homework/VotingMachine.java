package Week4.Homework;

public class VotingMachine {
    private int numberYesVotes;
    private int numberNoVotes;
    private String votingIssue;

    public VotingMachine(String votingIssue) {
        this.votingIssue = votingIssue;
    }

    public void voteYes(){
        numberYesVotes++;
    }

    public void voteNo(){
        numberNoVotes++;
    }

    public void clearMachine(){
        numberYesVotes = 0;
        numberNoVotes = 0;
    }

    public String toString() {
        return votingIssue + " has " + numberYesVotes + " votes Yes and " + numberNoVotes + " votes No";
    }
}
