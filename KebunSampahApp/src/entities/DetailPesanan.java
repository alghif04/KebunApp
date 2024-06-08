/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author ibadj
 */
public class DetailPesanan {
     private int id;
    private String pesananId;
    private String komoditiNama;
    private double komoditiHarga;
    private int jumlah;

    // Constructor
    public DetailPesanan(int id, String pesananId, String komoditiNama, double komoditiHarga, int jumlah) {
        this.id = id;
        this.pesananId = pesananId;
        this.komoditiNama = komoditiNama;
        this.komoditiHarga = komoditiHarga;
        this.jumlah = jumlah;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPesananId() {
        return pesananId;
    }

    public void setPesananId(String pesananId) {
        this.pesananId = pesananId;
    }

    public String getKomoditiNama() {
        return komoditiNama;
    }

    public void setKomoditiNama(String komoditiNama) {
        this.komoditiNama = komoditiNama;
    }

    public double getKomoditiHarga() {
        return komoditiHarga;
    }

    public void setKomoditiHarga(double komoditiHarga) {
        this.komoditiHarga = komoditiHarga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public double getTotalHarga() {
        return komoditiHarga * jumlah;
    }

@Override
public String toString() {
    return komoditiNama + " - Rp " + komoditiHarga + " Quantity " + jumlah;
}

}
