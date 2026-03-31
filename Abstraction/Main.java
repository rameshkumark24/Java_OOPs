package Abstraction;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {new CreditCardPayment(), new UPIPayment()};
        System.out.println("--- Starting Checkout ---");
        for (Payment pay : payments) {
            pay.processPayment(100.0);
        }
        System.out.println("--- Checkout Complete ---");
    }
}
