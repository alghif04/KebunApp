/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entities.Harga;
import kebunsampahapp.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Rohan
 */
public class HargaDao {

    public boolean addHarga(Harga harga) {
        String query = "INSERT INTO harga (jenis, harga, satuan) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, harga.getJenis());
            statement.setDouble(2, harga.getHarga());
            statement.setString(3, harga.getSatuan());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0; // Return true if rows were inserted
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an exception occurs
        }
    }

    public List<Harga> getAllHarga() {
        List<Harga> hargaList = new ArrayList<>();
        String query = "SELECT id, jenis, harga, satuan FROM harga";
        
        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String jenis = resultSet.getString("jenis");
                double hargaValue = resultSet.getDouble("harga");
                String satuan = resultSet.getString("satuan");
                Harga harga = new Harga(jenis, hargaValue, satuan);
                harga.setId(id);
                hargaList.add(harga);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hargaList;
    }

    public boolean deleteHargaByDetails(String jenis, double harga, String satuan) {
        String query = "DELETE FROM harga WHERE jenis = ? AND harga = ? AND satuan = ?";
        
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, jenis);
            statement.setDouble(2, harga);
            statement.setString(3, satuan);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0; // Return true if at least one row was deleted
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}

