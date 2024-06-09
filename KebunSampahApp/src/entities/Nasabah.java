/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Anonymous
 */

public class Nasabah {
    private String nama;
    private String status;
    private int nomorRumah;

    public Nasabah(String nama, String status, int nomorRumah) {
        this.nama = nama;
        this.status = status;
        this.nomorRumah = nomorRumah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getNomorRumah() {
        return nomorRumah;
    }

    public void setNomorRumah(int nomorRumah) {
        this.nomorRumah = nomorRumah;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nama='" + nama + '\'' +
                ", status='" + status + '\'' +
                ", nomorRumah='" + nomorRumah + '\'' +
                '}';
    }
}
