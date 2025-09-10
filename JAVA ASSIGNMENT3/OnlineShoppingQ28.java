/*28. Online Shopping Cart System 
Scenario: Build a simplified shopping cart system where users can add products, calculate total cost, and 
apply discounts. 
Problem Statement: 
● Class Product → instance variables: productId, name, price (Encapsulation: use private variables 
with getters/setters) 
● Abstract Class CartItem → method calculateTotalPrice() (Abstract Class: define generic 
behavior for cart items) 
● Class Cart extends CartItem → store list of products, implement calculateTotalPrice() 
● Interface Discountable → method applyDiscount(double percentage) (Interface: any item can 
have discounts applied) 
In main(), create a cart, add 3 products, apply 10% discount to one product, display total cost 
Sample Input: 
Product1 → name="Laptop", price=50000 
Product2 → name="Mouse", price=500 
Product3 → name="Keyboard", price=1200 
Sample Output: 
Applying 10% discount to Laptop 
Total Cart Price = 51800
*/
//java.util package contains many utility classes in Java like:ArrayList,List,Scanner.
import java.util.*;
// Product class (Encapsulation)
class Product {
    private int productId;
    private String name;
    private double price;

    // Constructor
    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Getters & Setters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Interface (Discountable)
interface Discountable {
    void applyDiscount(double percentage);
}

// Abstract class CartItem
abstract class CartItem {
    abstract double calculateTotalPrice();
}

// Cart class
class Cart extends CartItem {
    private List<Product> products;

    Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    @Override
    double calculateTotalPrice() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// DiscountedProduct (Product + Discountable)
class DiscountedProduct extends Product implements Discountable {

    DiscountedProduct(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public void applyDiscount(double percentage) {
        double discountedPrice = getPrice() - (getPrice() * percentage / 100);
        setPrice(discountedPrice);
        System.out.println("Applying " + percentage + "% discount to " + getName());
    }
}

// Main class
public class OnlineShoppingQ28{
    public static void main(String[] args) {
        Cart cart = new Cart();

        // Normal products
        Product mouse = new Product(2, "Mouse", 500);
        Product keyboard = new Product(3, "Keyboard", 1200);

        // Discountable product
        DiscountedProduct laptop = new DiscountedProduct(1, "Laptop", 50000);

        // Add products to cart
        cart.addProduct(laptop);
        cart.addProduct(mouse);
        cart.addProduct(keyboard);

        // Apply discount to Laptop
        laptop.applyDiscount(10);

        // Display total price
        System.out.println("Total Cart Price = " + cart.calculateTotalPrice());
    }
}