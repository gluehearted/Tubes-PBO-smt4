/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import model.MenuItem;
import model.Restaurant;

/**
 *
 * @author Gabriel Prakosa A
 */
public class DataLoader {
    public static List<Restaurant> loadSampleRestaurants() {
        List<Restaurant> list = new ArrayList<>();

        Restaurant r1 = new Restaurant("Nasi Oyeng");
        r1.addMenuItem(new MenuItem("Nasi Goreng", 15000));
        r1.addMenuItem(new MenuItem("Ayam Bakar", 20000));

        Restaurant r2 = new Restaurant("Mie Mantan");
        r2.addMenuItem(new MenuItem("Mie Ayam", 12000));
        r2.addMenuItem(new MenuItem("Bakso", 13000));

        list.add(r1);
        list.add(r2);
        return list;
    }
// Untuk ekstensi lebih lanjut: bisa tambahkan load/save dari file teks atau JSON.
}
