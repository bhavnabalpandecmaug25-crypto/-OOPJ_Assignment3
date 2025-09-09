class Product {
    private int productId;
    private String name;
    private double price;
    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}
abstract class CartItem {
    public abstract double calculateTotalPrice();
}
interface Discountable {
    void applyDiscount(double percentage);
}
import java.util.*;
class Cart extends CartItem implements Discountable {
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product p) { products.add(p); }
    public void applyDiscount(double percentage) {
        if(products.size() > 0) {
            Product p = products.get(0);
            double newPrice = p.getPrice() * (1 - percentage / 100);
            p.setPrice(newPrice);
            System.out.println("Applying " + percentage + "% discount to " + p.getName());
        }
    }
    public double calculateTotalPrice() {
        double total = 0;
        for(Product p : products) total += p.getPrice();
        return total;
    }
}
public class ShoppingCartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addProduct(new Product(1, "Laptop", 50000));
        cart.addProduct(new Product(2, "Mouse", 500));
        cart.addProduct(new Product(3, "Keyboard", 1200));
        cart.applyDiscount(10);
        System.out.println("Total Cart Price = " + (int)cart.calculateTotalPrice());
    }
}
