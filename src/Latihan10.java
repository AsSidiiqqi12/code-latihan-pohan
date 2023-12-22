import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " - Rp" + price;
    }
}

class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : items) {
            total += product.getPrice();
        }
        return total;
    }

    public void displayReceipt() {
        System.out.println("Receipt:");
        for (Product product : items) {
            System.out.println(product);
        }
        System.out.println("Total: Rp" + calculateTotal());
    }
}

public class Latihan10 {
    public static void main(String[] args) {
        Product product1 = new Product("Product A", 50.0);
        Product product2 = new Product("Product B", 30.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(product1);
        cart.addProduct(product2);

        cart.displayReceipt();
    }
}