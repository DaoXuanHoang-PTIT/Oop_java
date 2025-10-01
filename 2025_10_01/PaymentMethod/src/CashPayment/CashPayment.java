package CashPayment;

import Order.PaymentMethod;

public class CashPayment implements PaymentMethod {
    @Override
    public String getType() {
        return "Trực tiếp";
    }

    @Override
    public String getName() {
        return "tiền mặt";
    }
}
