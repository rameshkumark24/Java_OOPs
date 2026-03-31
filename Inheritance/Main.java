package Inheritance;

public class Main {
    public static void main(String[] args) {
        SavingsAccount mySavings = new SavingsAccount(1000, "Raja", 0.05);
        Acc myAcc = new Acc(2000, "Shyam", 0.03);
        mySavings.displayInfo(); 
        myAcc.displayInfo();
        mySavings.addInterest();
        mySavings.displayInfo();
    }
}