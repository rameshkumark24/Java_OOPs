package Polymorphism;

public class ShoppingCart {
    public void addItem(String item) {
        System.out.println("Added " + item + " to the shopping cart.");
    }
    public void addItem(String item, int quantity) {
        System.out.println("Added " + quantity + " of " + item + " to the shopping cart.");
    }
    public void addItem(String itemName, double price) {
        System.out.println("Added " + itemName + " costing $" + price);
    }
}
class Main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop");
        cart.addItem("Phone", 2);
        cart.addItem("Headphones", 59.99);
    }
}
//Method Overridding is already covered in UPIPayemnt class, on Interface class itself.