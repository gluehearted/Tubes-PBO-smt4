package model;

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran tunai sebesar Rp" + amount);
    }
}
