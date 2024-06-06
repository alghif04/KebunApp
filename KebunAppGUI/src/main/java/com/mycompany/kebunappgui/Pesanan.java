/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kebunappgui;

import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;

/**
 *
 * @author ibadj
 */
public class Pesanan {
     private static int count = 1; // Static counter for generating ID
    private int id;
    private Pelanggan pelanggan;
    private Date date;
    private String macamKomoditi;
    private double totalHarga;
    private JButton actionButton;

    public Pesanan(Pelanggan pelanggan, Date date, String macamKomoditi, double totalHarga, JButton actionButton) {
        this.id = count++;
        this.pelanggan = pelanggan;
        this.date = date;
        this.macamKomoditi = macamKomoditi;
        this.totalHarga = totalHarga;
        this.actionButton = actionButton;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMacamKomoditi() {
        return macamKomoditi;
    }

    public void setMacamKomoditi(String macamKomoditi) {
        this.macamKomoditi = macamKomoditi;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public JButton getActionButton() {
        return actionButton;
    }

    public void setActionButton(JButton actionButton) {
        this.actionButton = actionButton;
    }

    // Method to get formatted date string
    public String getDateString() {
        // Format date as required (e.g., %02d/Kebun/%tm-%tY)
        return String.format("%02d/Kebun/%tm-%tY", id, date, date);
    }
}
