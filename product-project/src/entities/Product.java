package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock (){
        double total = price * quantity;
        return total;
    };

    public void addProduct (int quantity){
        this.quantity += quantity;
    }

    public void removeProduct (int quantity){
        this.quantity -= quantity;
    }

    public String toString(){
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + "units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}
