package PaypalPayment;

import Order.PaymentMethod;

public class PaypalPayment implements PaymentMethod {
    @Override
    public String getType() {
        return "Không dùng tiền mặt";
    }

    @Override
    public String getName() {
        return "PayPal";
    }
}
