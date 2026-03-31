package Inheritance;

public class Acc extends SavingsAccount {
    public Acc(int balance, String name, double interestRate) {
        super(balance, name, interestRate);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("This is the Multilevel Subclass (Acc).");
    }
}