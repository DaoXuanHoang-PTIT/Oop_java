package shop;

import java.util.ArrayList;

public class Order {
    private Customer customer;
    private ArrayList<Product> products = new ArrayList<>();
    public static int orderCount = 0;

    public Order(Customer customer) {
        this.customer = customer;
        orderCount++;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void printOrder() {
        System.out.println("Order for " + customer);
        for (Product p : products) {
            System.out.println("- " + p);
        }
        System.out.println("Total: $" + calculateTotal());
    }
}