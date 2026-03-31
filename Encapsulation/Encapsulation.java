package Encapsulation;
public class Encapsulation {
    private int amount;
    private String name;
    public Encapsulation(int amount, String name) {
        this.amount = amount;
        this.name = name;
    }
    public int getAmount(){
        return amount;
    }
    public String getName(){
        return name;
    }
    public void setAmount(int amount){
        if(amount < 0){
            System.out.println("Amount cannot be negative.");
            return;
        }
        this.amount = amount;
        System.out.println("Amount updated to: " + amount);
    }
    public void setName(String name){
        this.name = name;
        System.out.println("Name updated to: " + name);
    }
}
