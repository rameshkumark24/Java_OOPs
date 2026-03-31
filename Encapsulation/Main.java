package Encapsulation;

class Main{
    public static void main(String[]args){
        Encapsulation mem01 = new Encapsulation(1000,"Ram");
        Encapsulation mem02 = new Encapsulation(2000,"Shyam");
        mem01.setAmount(2000);
        mem01.setName("Raja");
        System.out.println("Member 1:"+ mem01.getName() + " has amount: " + mem01.getAmount());
        System.out.println("Member 2:"+ mem02.getName() + " has amount: " + mem02.getAmount());
    }
}
    
