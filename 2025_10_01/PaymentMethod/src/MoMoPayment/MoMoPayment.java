package MoMoPayment;

import Order.PaymentMethod;

public class MoMoPayment implements PaymentMethod {
    @Override
    public String getType() {
        return "Không dùng tiền mặt";
    }

    @Override
    public String getName() {
        return "MoMo";
    }
}
