package Main;

import java.util.Scanner;

import Order.Order;
import Order.PaymentMethod;
import CreditCardPayment.CreditCardPayment;
import PaypalPayment.PaypalPayment;
import CashPayment.CashPayment;
import MoMoPayment.MoMoPayment;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();

        System.out.print("Nhập số tiền: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Chọn phương thức thanh toán:");
        System.out.println("1. Thẻ tín dụng");
        System.out.println("2. PayPal");
        System.out.println("3. Tiền mặt");
        System.out.println("4. MoMo");
        int choice = sc.nextInt();

        PaymentMethod method;
        switch (choice) {
            case 1: method = new CreditCardPayment(); break;
            case 2: method = new PaypalPayment(); break;
            case 3: method = new CashPayment(); break;
            case 4: method = new MoMoPayment(); break;
            default: 
                System.out.println("Lựa chọn không hợp lệ. Mặc định dùng tiền mặt.");
                method = new CashPayment();
        }

        Order order = new Order(name, amount, method);
        order.checkout();

        sc.close();
    }
}
