/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.List;
import model.MenuItem;
import model.Order;

/**
 *
 * @author Gabriel Prakosa A
 */
public class TextFormatter {
    public static void printReceipt(Order order) {
        System.out.println("======= STRUK PEMESANAN =======");
        System.out.println("Pelanggan : " + order.getCustomer().getUsername());
        System.out.println("Pesanan:");
        List<MenuItem> items = order.getItems();
        double total = 0;
        for (MenuItem item : items) {
            System.out.printf("- %-20s %8.2f\n", item.getName(), item.getPrice());
            total += item.getPrice();
        }
        System.out.println("--------------------------------");
        System.out.printf("Total : %26.2f\n", total);
        System.out.println("================================\n");
    }
}
