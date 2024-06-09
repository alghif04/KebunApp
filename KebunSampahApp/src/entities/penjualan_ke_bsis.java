/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Rohan
 */
import java.util.Date;

public class penjualan_ke_bsis {
    private int id;
    private String noTransaksi;
    private Date tanggal;
    private double totalKg;
    private int totalBiji;
    private double totalPenjualan;

    public penjualan_ke_bsis(int id, String noTransaksi, Date tanggal, double totalKg, int totalBiji, double totalPenjualan) {
        this.id = id;
        this.noTransaksi = noTransaksi;
        this.tanggal = tanggal;
        this.totalKg = totalKg;
        this.totalBiji = totalBiji;
        this.totalPenjualan = totalPenjualan;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoTransaksi() {
        return noTransaksi;
    }

    public void setNoTransaksi(String noTransaksi) {
        this.noTransaksi = noTransaksi;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(double totalKg) {
        this.totalKg = totalKg;
    }

    public int getTotalBiji() {
        return totalBiji;
    }

    public void setTotalBiji(int totalBiji) {
        this.totalBiji = totalBiji;
    }

    public double getTotalPenjualan() {
        return totalPenjualan;
    }

    public void setTotalPenjualan(double totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}
