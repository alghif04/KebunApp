/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.Nasabah;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import kebunsampahapp.DatabaseConnection;

public class NasabahDAO {
    public void addNasabah(Nasabah nasabah) {
        String query = "INSERT INTO nasabah (nasabah_nama, nasabah_status, nasabah_nomor_rumah) VALUES (?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, nasabah.getNama());
            pst.setString(2, nasabah.getStatus());
            pst.setInt(3, nasabah.getNomorRumah());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Metode lainnya (delete, getNasabah, dll.)


    // Metode lainnya (delete, getNasabah, dll.)



    public ResultSet getNasabah() {
        String query = "SELECT * FROM nasabah";
        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement pst = con.prepareStatement(query);
            return pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void saveNasabah(Nasabah nasabah) {
        String query = "INSERT INTO nasabah (nama, status, nomor_rumah) VALUES (?, ?, ?)";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, nasabah.getNama());
            pst.setString(2, nasabah.getStatus());
            pst.setInt(3, nasabah.getNomorRumah());
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void deleteNasabahByDetails(String nama, String status, int nomorRumah) {
        String query = "DELETE FROM nasabah WHERE nasabah_nama = ? AND nasabah_status = ? AND nasabah_nomor_rumah = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {
            pst.setString(1, nama);
            pst.setString(2, status);
            pst.setInt(3, nomorRumah);
            pst.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
     
    
    