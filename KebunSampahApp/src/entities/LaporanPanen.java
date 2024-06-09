package entities;

import java.sql.Date;

public class LaporanPanen {
    private int panenId;
    private Date panenTanggal;
    private String panenKomoditi;
    private double panenBerat;

    // Constructor
    public LaporanPanen(int panenId, Date panenTanggal, String panenKomoditi, double panenBerat) {
        this.panenId = panenId;
        this.panenTanggal = panenTanggal;
        this.panenKomoditi = panenKomoditi;
        this.panenBerat = panenBerat;
    }

    // Getters and Setters
    public int getPanenId() {
        return panenId;
    }

    public void setPanenId(int panenId) {
        this.panenId = panenId;
    }

    public Date getPanenTanggal() {
        return panenTanggal;
    }

    public void setPanenTanggal(Date panenTanggal) {
        this.panenTanggal = panenTanggal;
    }

    public String getPanenKomoditi() {
        return panenKomoditi;
    }

    public void setPanenKomoditi(String panenKomoditi) {
        this.panenKomoditi = panenKomoditi;
    }

    public double getPanenBerat() {
        return panenBerat;
    }

    public void setPanenBerat(double panenBerat) {
        this.panenBerat = panenBerat;
    }
}
