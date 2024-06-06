/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kebunappgui;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author ibadj
 */
public class PelangganLoader {
        public static List<Pelanggan> loadPelangganFromBinFile(String filename) {
        List<Pelanggan> pelangganList = new ArrayList<>();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Vector<Vector> dataVector = (Vector<Vector>) ois.readObject();
            for (Vector row : dataVector) {
                String nama = row.get(0).toString();
                String alamat = row.get(1).toString();
                String noTelp = row.get(2).toString();
                Pelanggan pelanggan = new Pelanggan(nama, alamat, noTelp);
                pelangganList.add(pelanggan);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error loading Pelanggan data: " + e.getMessage());
        }

        return pelangganList;
    }
}
