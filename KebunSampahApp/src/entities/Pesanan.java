package entities;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import entities.Pelanggan;
import java.util.Date;

/**
 *
 * @author ibadj
 */


public class Pesanan {
    private String pesananId;
    private String pesananNama;
    private Date pesananTanggal;
    private String pesananMacamKomoditi;
    private double pesananTotalHarga;

    // Constructor
    public Pesanan(String pesananId, String pesananNama, Date pesananTanggal, String pesananMacamKomoditi, double pesananTotalHarga) {
        this.pesananId = pesananId;
        this.pesananNama = pesananNama;
        this.pesananTanggal = pesananTanggal;
        this.pesananMacamKomoditi = pesananMacamKomoditi;
        this.pesananTotalHarga = pesananTotalHarga;
    }

    // Getters and setters
    public String getPesananId() {
        return pesananId;
    }

    public void setPesananId(String pesananId) {
        this.pesananId = pesananId;
    }

    public String getPesananNama() {
        return pesananNama;
    }

    public void setPesananNama(String pesananNama) {
        this.pesananNama = pesananNama;
    }

    public Date getPesananTanggal() {
        return pesananTanggal;
    }

    public void setPesananTanggal(Date pesananTanggal) {
        this.pesananTanggal = pesananTanggal;
    }

    public String getPesananMacamKomoditi() {
        return pesananMacamKomoditi;
    }

    public void setPesananMacamKomoditi(String pesananMacamKomoditi) {
        this.pesananMacamKomoditi = pesananMacamKomoditi;
    }

    public double getPesananTotalHarga() {
        return pesananTotalHarga;
    }

    public void setPesananTotalHarga(double pesananTotalHarga) {
        this.pesananTotalHarga = pesananTotalHarga;
    }

    @Override
    public String toString() {
        return "Pesanan{" +
                "pesananId='" + pesananId + '\'' +
                ", pesananNama='" + pesananNama + '\'' +
                ", pesananTanggal=" + pesananTanggal +
                ", pesananMacamKomoditi='" + pesananMacamKomoditi + '\'' +
                ", pesananTotalHarga=" + pesananTotalHarga +
                '}';
    }
}

