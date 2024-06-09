package dao;

import entities.penjualan_ke_bsis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kebunsampahapp.DatabaseConnection;

public class PenjualanKeBsisDAO {

    public void insert(penjualan_ke_bsis penjualan) throws SQLException {
        String sql = "INSERT INTO penjualan_ke_bsis (no_transaksi, tanggal, total_kg, total_biji, total_penjualan) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, penjualan.getNoTransaksi());
            statement.setDate(2, new java.sql.Date(penjualan.getTanggal().getTime()));
            statement.setDouble(3, penjualan.getTotalKg());
            statement.setInt(4, penjualan.getTotalBiji());
            statement.setDouble(5, penjualan.getTotalPenjualan());
            statement.executeUpdate();
        }
    }

    public void update(penjualan_ke_bsis penjualan) throws SQLException {
        String sql = "UPDATE penjualan_ke_bsis SET no_transaksi = ?, tanggal = ?, total_kg = ?, total_biji = ?, total_penjualan = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, penjualan.getNoTransaksi());
            statement.setDate(2, new java.sql.Date(penjualan.getTanggal().getTime()));
            statement.setDouble(3, penjualan.getTotalKg());
            statement.setInt(4, penjualan.getTotalBiji());
            statement.setDouble(5, penjualan.getTotalPenjualan());
            statement.setInt(6, penjualan.getId());
            statement.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM penjualan_ke_bsis WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public penjualan_ke_bsis getById(int id) throws SQLException {
        String sql = "SELECT * FROM penjualan_ke_bsis WHERE id = ?";
        penjualan_ke_bsis penjualan = null;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    penjualan = new penjualan_ke_bsis(
                        resultSet.getInt("id"),
                        resultSet.getString("no_transaksi"),
                        resultSet.getDate("tanggal"),
                        resultSet.getDouble("total_kg"),
                        resultSet.getInt("total_biji"),
                        resultSet.getDouble("total_penjualan")
                    );
                }
            }
        }
        return penjualan;
    }

    public List<penjualan_ke_bsis> getAll() throws SQLException {
        String sql = "SELECT * FROM penjualan_ke_bsis";
        List<penjualan_ke_bsis> penjualanList = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                penjualan_ke_bsis penjualan = new penjualan_ke_bsis(
                    resultSet.getInt("id"),
                    resultSet.getString("no_transaksi"),
                    resultSet.getDate("tanggal"),
                    resultSet.getDouble("total_kg"),
                    resultSet.getInt("total_biji"),
                    resultSet.getDouble("total_penjualan")
                );
                penjualanList.add(penjualan);
            }
        }
        return penjualanList;
    }
    public void deleteByNoTransaksi(String noTransaksi) throws SQLException {
    String sql = "DELETE FROM penjualan_ke_bsis WHERE no_transaksi = ?";

    try (Connection connection = DatabaseConnection.getConnection();
         PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, noTransaksi);
        statement.executeUpdate();
    }
}

}

