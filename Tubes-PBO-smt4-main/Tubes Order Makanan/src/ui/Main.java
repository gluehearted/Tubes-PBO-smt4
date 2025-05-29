/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Gabriel Prakosa A
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Aplikasi Registrasi");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null); // center window
            frame.setContentPane(new RegisterScreen()); // load panel RegisterScreen
            frame.setVisible(true);
        });
    }
}

