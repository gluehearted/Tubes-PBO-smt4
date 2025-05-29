package model;

public class Customer extends User {
    private Cart<MenuItem> cart;
    private double balance;

    public Customer(String username, String password, double balance) {
        super(username, password);
        this.balance = balance;
        this.cart = new Cart<>();
    }

    public Cart<MenuItem> getCart() {
        return cart;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void showMenu() {
        System.out.println("1. Lihat Restoran\n2. Lihat Keranjang\n3. Checkout");
    }
}
