package model;

public class EWalletPayment implements PaymentMethod {
    private String walletName;

    public EWalletPayment(String walletName) {
        this.walletName = walletName;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pembayaran melalui " + walletName + " sebesar Rp" + amount);
    }
}
