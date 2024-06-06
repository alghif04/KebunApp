/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kebunappgui;

import java.io.Serializable;

/**
 *
 * @author ibadj
 */
public class Komoditi implements Serializable{
    private String nama;
    private double harga;
    private String satuan;

    // Constructor
    public Komoditi(String nama, double harga, String satuan) {
        this.nama = nama;
        this.harga = harga;
        this.satuan = satuan;
    }

    // Getters and setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    // toString method to display Komoditi information
  @Override
    public String toString() {
        return nama;
    }
}
