/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entities.DetailPesanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kebunsampahapp.DatabaseConnection;
/**
 *
 * @author ibadj
 */
public class DetailPesananDAO {
     public void addDetailPesanan(DetailPesanan detail) {
        String query = "INSERT INTO detailpesanan (Pesanan_id, Komoditi_nama, Komoditi_harga, Jumlah) VALUES (?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, detail.getPesananId());
            statement.setString(2, detail.getKomoditiNama());
            statement.setDouble(3, detail.getKomoditiHarga());
            statement.setDouble(4, detail.getJumlah());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to retrieve details of a pesanan by Pesanan_id
    public List<DetailPesanan> getDetailsByPesananId(String pesananId) {
        List<DetailPesanan> details = new ArrayList<>();
        String query = "SELECT * FROM detailpesanan WHERE Pesanan_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, pesananId);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String komoditiNama = resultSet.getString("Komoditi_nama");
                double komoditiHarga = resultSet.getDouble("Komoditi_harga");
                double jumlah = resultSet.getDouble("Jumlah"); // Changed from int to double

                DetailPesanan detail = new DetailPesanan(id, pesananId, komoditiNama, komoditiHarga, jumlah);
                details.add(detail);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return details;
    }
    
    
public boolean deleteDetailByPesananIdAndKomoditiNama(String pesananId, String komoditiNama) {
    String query = "DELETE FROM detailpesanan WHERE pesanan_id = ? AND komoditi_nama = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, pesananId);
        statement.setString(2, komoditiNama);
        int rowsAffected = statement.executeUpdate();

        return rowsAffected > 0; // Return true if at least one row was deleted
    } catch (SQLException e) {
        e.printStackTrace();
        return false; // Return false if an exception occurs
    }
}


}



