package dao;

import entities.LaporanPanen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import kebunsampahapp.DatabaseConnection;


public class LaporanPanenDAO {
    public boolean addLaporanPanen(LaporanPanen laporanPanen) {
        String query = "INSERT INTO laporanpanen (Panen_tanggal, Panen_komoditi, Panen_berat) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDate(1, laporanPanen.getPanenTanggal());
            statement.setString(2, laporanPanen.getPanenKomoditi());
            statement.setDouble(3, laporanPanen.getPanenBerat());

            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0; // Return true if rows were inserted
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an exception occurs
        }
    }

    public List<LaporanPanen> getAllLaporanPanen() {
        List<LaporanPanen> laporanPanenList = new ArrayList<>();
        String query = "SELECT * FROM laporanpanen";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int panenId = resultSet.getInt("Panen_id");
                java.sql.Date panenTanggal = resultSet.getDate("Panen_tanggal");
                String panenKomoditi = resultSet.getString("Panen_komoditi");
                double panenBerat = resultSet.getDouble("Panen_berat");

                LaporanPanen laporanPanen = new LaporanPanen(panenId, panenTanggal, panenKomoditi, panenBerat);
                laporanPanenList.add(laporanPanen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laporanPanenList;
    }

    public boolean deleteLaporanPanenById(int panenId) {
        String query = "DELETE FROM laporanpanen WHERE Panen_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, panenId);
            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0; // Return true if at least one row was deleted
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Return false if an exception occurs
        }
    }

    public LaporanPanen getLaporanPanenById(int panenId) {
        String query = "SELECT * FROM laporanpanen WHERE Panen_id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, panenId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                java.sql.Date panenTanggal = resultSet.getDate("Panen_tanggal");
                String panenKomoditi = resultSet.getString("Panen_komoditi");
                double panenBerat = resultSet.getDouble("Panen_berat");

                return new LaporanPanen(panenId, panenTanggal, panenKomoditi, panenBerat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; // Return null if no record found
    }
    public boolean deleteLaporanPanenByDetails(String tanggal, String komoditi, double berat) {
    String query = "DELETE FROM laporanpanen WHERE Panen_tanggal = ? AND Panen_komoditi = ? AND Panen_berat = ?";
    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, tanggal);
        statement.setString(2, komoditi);
        statement.setDouble(3, berat);
        
        int rowsAffected = statement.executeUpdate();
        return rowsAffected > 0; // Return true if at least one row was deleted
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
}
 public List<LaporanPanen> getFilteredDataByDateRange(Date fromDate, Date toDate) throws SQLException {
        List<LaporanPanen> filteredData = new ArrayList<>();
        String query = "SELECT * FROM laporanpanen WHERE Panen_tanggal BETWEEN ? AND ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setDate(1, fromDate);
            statement.setDate(2, toDate);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int panenId = resultSet.getInt("Panen_id");
                Date panenTanggal = resultSet.getDate("Panen_tanggal");
                String panenKomoditi = resultSet.getString("Panen_komoditi");
                double panenBerat = resultSet.getDouble("Panen_berat");

                LaporanPanen laporanPanen = new LaporanPanen(panenId, panenTanggal, panenKomoditi, panenBerat);
                filteredData.add(laporanPanen);
            }
        }

        return filteredData;
    }
 
 
}



