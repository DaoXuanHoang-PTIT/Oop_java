package shop;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Bảo", "bao@example.com");

        Product product1 = new Product("Laptop", 1500.0);
        Product product2 = new Product("Mouse", 25.0);

        Order order = new Order(customer1);
        order.addProduct(product1);
        order.addProduct(product2);

        order.printOrder();

        System.out.println("Total orders: " + Order.orderCount);
    }
}