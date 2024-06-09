/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Anonymous
 */


import entities.Setoran;
import kebunsampahapp.DatabaseConnection;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SetoranDAO {
    private static final String INSERT_SETORAN = "INSERT INTO setoran (tanggal_setor, nama, jenis, harga_satuan, kuantitas, penerimaan) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_NAMA_NASABAH = "SELECT nasabah_nama FROM nasabah";
    private static final String SELECT_JENIS_HARGA = "SELECT DISTINCT jenis FROM harga";
    private static final String SELECT_HARGA_BY_JENIS = "SELECT harga FROM harga WHERE jenis = ?";

    public void addSetoran(Setoran setoran) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(INSERT_SETORAN, PreparedStatement.RETURN_GENERATED_KEYS)) {
            pst.setDate(1, setoran.getTanggalSetor());
            pst.setString(2, setoran.getNama());
            pst.setString(3, setoran.getJenis());
            pst.setInt(4, setoran.getHargaSatuan());
            pst.setDouble(5, setoran.getKuantitas());
            pst.setInt(6, setoran.getPenerimaan());

            pst.executeUpdate();

            ResultSet generatedKeys = pst.getGeneratedKeys();
            if (generatedKeys.next()) {
                setoran.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<String> loadNamaNasabah() {
        List<String> namaList = new ArrayList<>();
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(SELECT_NAMA_NASABAH);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                namaList.add(rs.getString("nasabah_nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return namaList;
    }

    public List<String> loadJenisHarga() {
        List<String> jenisList = new ArrayList<>();
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(SELECT_JENIS_HARGA);
             ResultSet rs = pst.executeQuery()) {
            while (rs.next()) {
                jenisList.add(rs.getString("jenis"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jenisList;
    }

    public int getHargaByJenis(String jenis) {
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(SELECT_HARGA_BY_JENIS)) {
            pst.setString(1, jenis);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("harga");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0; // return 0 if not found or an error occurs
    }
     public void deleteSetoranByDetails(String tanggal, int nomorRumah, String jenis) {
    String query = "DELETE FROM setoran WHERE tanggal_setoran = ? AND nomor_rumah = ? AND jenis_setoran = ?";
    try (Connection con = DatabaseConnection.getConnection();
         PreparedStatement pst = con.prepareStatement(query)) {
        pst.setString(1, tanggal);
        pst.setInt(2, nomorRumah);
        pst.setString(3, jenis);
        pst.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
    

    
