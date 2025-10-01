import java.util.Scanner;

interface PaymentMethod {
    void pay(String customerName, double amount);
}

class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " bằng thẻ tín dụng.\n");
    }
}

class PaypalPayment implements PaymentMethod {
    @Override
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " qua PayPal.\n");
    }
}

class CashPayment implements PaymentMethod {
    @Override
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " bằng tiền mặt.\n");
    }
}

class MoMoPayment implements PaymentMethod {
    @Override
    public void pay(String customerName, double amount) {
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Thanh toán " + amount + " qua MoMo.\n");
    }
}

class Order {
    private String customerName;
    private double amount;
    private PaymentMethod paymentMethod;

    public Order(String customerName, double amount, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void checkout() {
        paymentMethod.pay(customerName, amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập số tiền thanh toán: ");
        double amount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Chọn phương thức thanh toán:");
        System.out.println("1. Thẻ tín dụng");
        System.out.println("2. PayPal");
        System.out.println("3. Tiền mặt");
        System.out.println("4. MoMo");
        System.out.print("Lựa chọn: ");
        int choice = sc.nextInt();
        PaymentMethod method;
        switch (choice) {
            case 1: method = new CreditCardPayment(); break;
            case 2: method = new PaypalPayment(); break;
            case 3: method = new CashPayment(); break;
            case 4: method = new MoMoPayment(); break;
            default:
                System.out.println("Phương thức không hợp lệ!");
                sc.close();
                return;
        }
        Order order = new Order(name, amount, method);
        order.checkout();
        sc.close();
    }
}
