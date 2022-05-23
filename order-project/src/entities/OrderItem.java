package entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;
//    private List <Product> products = new ArrayList<>();
    private Product product;

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subtotal (){
        return price * quantity;
    }

    @Override
    public String toString (){
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + "Quantity: "
                + quantity
                + ", Subtotal: $"
                + String.format("%.2f", subtotal());
    }
}
