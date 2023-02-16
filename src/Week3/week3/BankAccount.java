package Week3.week3;

public class BankAccount {

    //instance variables
    private String owner;
    private int accountNum;
    private double balance;

    //constructor
    public BankAccount(String name, int accountNum) {
        owner = name;
        this.accountNum = accountNum;
        balance = 0;
    }



    //Deposit Method
    public void deposit(double amount) {
        balance += amount;
    }

    //Withdrawal Method
    public void withdraw(double amount) {
        if (balance >= 0)
            balance -= amount;
    }

    //For Printing
    public String toString() {

        return owner + " has account " + accountNum + " with balance $" + balance;
    }

    public static void main(String[] args) {
        BankAccount samAccount = new BankAccount("Sam Jones", 123);
        System.out.println(samAccount);
        samAccount.deposit(100);
        System.out.println(samAccount);
        samAccount.withdraw(10.25);
        System.out.println(samAccount);
//        //BankAccount joeAccount = new BankAccount("Joe", 345, 100);
//        //System.out.println(joeAccount);
    }
}
