package entities;

import java.sql.Date;

public class Setoran {
    private int id;
    private Date tanggalSetor;
    private String nama;
    private String jenis;
    private int hargaSatuan;
    private double kuantitas;
    private int penerimaan;

    public Setoran(Date tanggalSetor, String nama, String jenis, int hargaSatuan, double kuantitas, int penerimaan) {
        this.tanggalSetor = tanggalSetor;
        this.nama = nama;
        this.jenis = jenis;
        this.hargaSatuan = hargaSatuan;
        this.kuantitas = kuantitas;
        this.penerimaan = penerimaan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getTanggalSetor() {
        return tanggalSetor;
    }

    public void setTanggalSetor(Date tanggalSetor) {
        this.tanggalSetor = tanggalSetor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getHargaSatuan() {
        return hargaSatuan;
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
    }

    public double getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(double kuantitas) {
        this.kuantitas = kuantitas;
    }

    public int getPenerimaan() {
        return penerimaan;
    }

    public void setPenerimaan(int penerimaan) {
        this.penerimaan = penerimaan;
    }
}
