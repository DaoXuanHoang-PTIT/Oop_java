package CreditCardPayment;

import Order.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {
    @Override
    public String getType() {
        return "Không dùng tiền mặt";
    }

    @Override
    public String getName() {
        return "thẻ tín dụng";
    }
}
