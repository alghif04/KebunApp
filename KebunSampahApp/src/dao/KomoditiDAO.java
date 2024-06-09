/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kebunsampahapp.DatabaseConnection;
import kebunsampahapp.Komoditi;
/**
 *
 * @author ibadj
 */
public class KomoditiDAO {
   
public boolean addKomoditi(Komoditi komoditi) {
    String query = "INSERT INTO komoditi (Komoditi_nama, Komoditi_harga, Komoditi_satuan) VALUES (?, ?, ?)";

    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, komoditi.getNama());
        statement.setDouble(2, komoditi.getHarga());
        statement.setString(3, komoditi.getSatuan());
        int rowsInserted = statement.executeUpdate();
        return rowsInserted > 0; // Return true if rows were inserted
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Return false if an exception occurs
    }
}

    public List<Komoditi> getAllKomoditi() {
        List<Komoditi> komoditiList = new ArrayList<>();
        String query = "SELECT Komoditi_nama, Komoditi_harga, Komoditi_satuan FROM komoditi";
        
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String nama = resultSet.getString("Komoditi_nama");
                double harga = resultSet.getDouble("Komoditi_harga");
                String satuan = resultSet.getString("Komoditi_satuan");
                Komoditi komoditi = new Komoditi(nama, harga, satuan);
                komoditiList.add(komoditi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return komoditiList;
    }

public boolean deleteKomoditiByDetails(String nama, double harga, String satuan) {
    String query = "DELETE FROM komoditi WHERE Komoditi_nama = ? AND Komoditi_harga = ? AND Komoditi_satuan = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, nama);
        statement.setDouble(2, harga);
        statement.setString(3, satuan);
        int rowsAffected = statement.executeUpdate();

        return rowsAffected > 0; // Return true if at least one row was deleted
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

     public double getHargaFromSelectedCommodity(String komoditiNama) {
        String query = "SELECT Komoditi_harga FROM komoditi WHERE Komoditi_nama = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, komoditiNama);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getDouble("Komoditi_harga");
            } else {
                System.out.println("Commodity not found: " + komoditiNama);
                return 0.0; // Default to 0 if commodity not found
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return 0.0; // Handle error or return a default value
        }
    }

    // Existing methods...

    public List<String> getAllKomoditiNama() {
       List<String> komoditiNamaList = new ArrayList<>();
        String query = "SELECT Komoditi_nama FROM komoditi ORDER BY Komoditi_nama ASC";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                komoditiNamaList.add(resultSet.getString("Komoditi_nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return komoditiNamaList;
    }

}



