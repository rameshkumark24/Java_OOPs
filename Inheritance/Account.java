package Inheritance;

public class Account {
    private int balance;
    private String name;
    public Account(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }
    public int getBalance(){
        return balance;
    }
    public int setBalance(int balance){
        if(balance < 0){
            System.out.println("Balance cannot be negative.");
            return this.balance;
        }
        this.balance = balance;
        System.out.println("Balance updated to: " + balance);
        return this.balance;
    }
    public String getName(){
        return name;
    }
    public void displayInfo(){
        System.out.println("Account Holder: " + name + ", Balance: " + balance);
    }
}
