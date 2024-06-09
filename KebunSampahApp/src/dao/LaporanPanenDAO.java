package dao;

import entities.LaporanPanen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kebunsampahapp.DatabaseConnection;

public class LaporanPanenDAO {

    public boolean addLaporanPanen(LaporanPanen laporanpanen) {
        String query = "INSERT INTO laporanpanen (LaporanPanen_namapanen, LaporanPanen_beratpanen) VALUES (?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, laporanpanen.getNamaPanen());
            statement.setString(2, laporanpanen.getBeratPanen());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<LaporanPanen> getAllLaporanPanen() {
        List<LaporanPanen> laporanpanenList = new ArrayList<>();
        String query = "SELECT LaporanPanen_namapanen, LaporanPanen_beratpanen FROM laporanpanen";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String namapanen = resultSet.getString("LaporanPanen_namapanen");
                String beratpanen = resultSet.getString("LaporanPanen_beratpanen");
                LaporanPanen laporanpanen = new LaporanPanen(namapanen, beratpanen);
                laporanpanenList.add(laporanpanen);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return laporanpanenList;
    }

    public boolean deleteLaporanPanenByDetails(String namapanen, String beratpanen) {
        String query = "DELETE FROM laporanpanen WHERE LaporanPanen_namapanen = ? AND LaporanPanen_beratpanen = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, namapanen);
            statement.setString(2, beratpanen);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateLaporanPanen(String oldNamaPanen, String oldBeratPanen, String newNamaPanen, String newBeratPanen) {
        String query = "UPDATE laporanpanen SET LaporanPanen_namapanen = ?, LaporanPanen_beratpanen = ? WHERE LaporanPanen_namapanen = ? AND LaporanPanen_beratpanen = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, newNamaPanen);
            statement.setString(2, newBeratPanen);
            statement.setString(3, oldNamaPanen);
            statement.setString(4, oldBeratPanen);
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
