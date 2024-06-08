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
import java.sql.ResultSet;
import java.sql.SQLIntegrityConstraintViolationException;

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
    
        public void addPesanan(Pesanan pesanan, String status) throws SQLException {
        String query = "INSERT INTO pesanan (Pesanan_id, Pesanan_nama, Pesanan_tanggal, Pesanan_macamkomoditi, Pesanan_totalharga, Pesanan_status) VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pesanan.getPesananId());
            statement.setString(2, pesanan.getPesananNama());
            statement.setDate(3, new java.sql.Date(pesanan.getPesananTanggal().getTime()));
            statement.setString(4, pesanan.getPesananMacamKomoditi());
            statement.setDouble(5, pesanan.getPesananTotalHarga());
            statement.setString(6, status);  // Set the status
            statement.executeUpdate();
        }
    }

    // Method to update Pesanan status by ID
    public boolean updatePesananStatus(String pesananId, String status) {
        String query = "UPDATE pesanan SET Pesanan_status = ? WHERE Pesanan_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, status);
            statement.setString(2, pesananId);
            int rowsUpdated = statement.executeUpdate();
            return rowsUpdated > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean updateStatusToLunas(String orderId) {
    String query = "UPDATE pesanan SET Pesanan_status = 'lunas' WHERE Pesanan_id = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, orderId);
        int rowsUpdated = statement.executeUpdate();
        return rowsUpdated > 0; // Return true if at least one row was updated
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}


    
     public boolean deletePesananByID(String orderID) throws SQLException {
        String query = "DELETE FROM pesanan WHERE Pesanan_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, orderID);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLIntegrityConstraintViolationException e) {
            throw new SQLException("Cannot delete order with ID " + orderID + " because it has related order details.", e);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public void updatePesananTotalHarga(String pesananId, double totalHarga) {
        String query = "UPDATE pesanan SET Pesanan_totalharga = ? WHERE Pesanan_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setDouble(1, totalHarga);
            statement.setString(2, pesananId);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Pesanan total harga updated successfully!");
            } else {
                System.out.println("Failed to update pesanan total harga!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
   public void updatePesanan(String pesananId, double totalHarga, int macamKomoditiCount) {
    String query = "UPDATE pesanan SET Pesanan_totalharga = ?, Pesanan_macamkomoditi = ? WHERE Pesanan_id = ?";

    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setDouble(1, totalHarga);
        statement.setInt(2, macamKomoditiCount);
        statement.setString(3, pesananId);

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Pesanan updated successfully!");
        } else {
            System.out.println("Failed to update Pesanan!");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   
    public Pesanan getPesananById(String pesananId) {
        Pesanan pesanan = null;
        String query = "SELECT Pesanan_id, Pesanan_nama, Pesanan_tanggal, Pesanan_macamkomoditi, Pesanan_totalharga FROM pesanan WHERE Pesanan_id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, pesananId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String pesananNama = resultSet.getString("Pesanan_nama");
                java.util.Date pesananTanggal = resultSet.getDate("Pesanan_tanggal");
                String pesananMacamKomoditi = resultSet.getString("Pesanan_macamkomoditi");
                double pesananTotalHarga = resultSet.getDouble("Pesanan_totalharga");

                // Create Pesanan object
                pesanan = new Pesanan(pesananId, pesananNama, pesananTanggal, pesananMacamKomoditi, pesananTotalHarga);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return pesanan;
    }
    public void updateStatus(String pesananId, String status) {
        String query = "UPDATE pesanan SET status = ? WHERE pesanan_id = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, status);
            statement.setString(2, pesananId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    

}
