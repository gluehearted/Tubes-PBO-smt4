package service;

import db.DatabaseConnection;
import model.Admin;
import model.Customer;
import model.User;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Optional;
import javax.swing.JOptionPane;

public class UserService {

    public static Optional<User> login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public static boolean register(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private Connection Con;

    public UserService() {
        initComponents();
        koneksiDatabase();
    }

    private void initComponents() {
        // Inisialisasi komponen jika diperlukan
    }

    private void koneksiDatabase() {
        try {
            // Menentukan Driver Database
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Untuk mengkoneksikan DB ke Driver
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_appmakanan", "root", "");

            // Pesan Koneksi Berhasil
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil!");
        } catch (Exception e) {
            // Pesan Koneksi Gagal
            System.out.println("Koneksi Gagal: " + e.getMessage());
        }
    }

    public void registerCustomer(String username, String password, double balance) throws Exception {
        String checkSql = "SELECT * FROM users WHERE username = ?";
        String insertSql = "INSERT INTO users (username, password, role, balance) VALUES (?, ?, 'customer', ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {

            checkStmt.setString(1, username);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next()) {
                throw new Exception("Username sudah dipakai!");
            }

            try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                insertStmt.setString(1, username);
                insertStmt.setString(2, password);
                insertStmt.setDouble(3, balance);
                insertStmt.executeUpdate();
            }

        } catch (Exception e) {
            throw new Exception("Gagal register user: " + e.getMessage());
        }
    }
}
