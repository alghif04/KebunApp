/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author ibadj
 */
import entities.Pesanan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import kebunsampahapp.DatabaseConnection;

public class PesananDAO {
    private final Connection connection;

    // Constructor
    public PesananDAO(Connection connection) {
        this.connection = connection;
    }

    // Method to add Pesanan to the database
    public void addPesanan(Pesanan pesanan) throws SQLException {
        String query = "INSERT INTO pesanan (Pesanan_id, Pesanan_nama, Pesanan_tanggal, Pesanan_macamkomoditi, Pesanan_totalharga) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pesanan.getPesananId());
            statement.setString(2, pesanan.getPesananNama());
            statement.setDate(3, new java.sql.Date(pesanan.getPesananTanggal().getTime()));
            statement.setString(4, pesanan.getPesananMacamKomoditi());
            statement.setDouble(5, pesanan.getPesananTotalHarga());
            statement.executeUpdate();
        }
    }
    
    public boolean deletePesananByID(String orderID) {
    String query = "DELETE FROM pesanan WHERE Pesanan_id = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, orderID);
        int rowsAffected = statement.executeUpdate();
        return rowsAffected > 0; // Return true if at least one row was deleted
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}

}
