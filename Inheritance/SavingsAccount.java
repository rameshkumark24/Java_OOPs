package Inheritance;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int balance, String name, double interestRate) {
        super(balance, name); 
        this.interestRate = interestRate;
    }

    public void addInterest() {
        int current = getBalance(); // Works now because Account is found
        int interest = (int)(current * interestRate);
        setBalance(current + interest);
        System.out.println("Interest added: " + interest);
    }
}