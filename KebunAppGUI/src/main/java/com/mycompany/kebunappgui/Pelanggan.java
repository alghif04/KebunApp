/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kebunappgui;

/**
 *
 * @author ibadj
 */
public class Pelanggan {
        private String nama;
    private String alamat;
    private String noTelp;

    // Constructor
    public Pelanggan(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    @Override
    public String toString() {
        return this.nama; // or any other string representation you want
    }
}
