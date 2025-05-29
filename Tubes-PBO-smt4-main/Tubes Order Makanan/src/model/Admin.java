package model;

public class Admin extends User {
    public Admin(String username, String password) {
        super(username, password);
    }

    @Override
    public void showMenu() {
        System.out.println("1. Tambah Menu\n2. Kelola Restoran\n3. Logout");
    }
}
