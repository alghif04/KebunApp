package dao;

import entities.Pelanggan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import kebunsampahapp.DatabaseConnection;

public class PelangganDAO {
private Connection connection;

    public PelangganDAO() {
        this.connection = DatabaseConnection.getConnection();
    }
    // Add a new pelanggan to the database
    public boolean addPelanggan(Pelanggan pelanggan) {
        String query = "INSERT INTO pelanggan (Pelanggan_nama, Pelanggan_alamat, Pelanggan_notelp) VALUES (?, ?, ?)";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, pelanggan.getNama());
            statement.setString(2, pelanggan.getAlamat());
            statement.setString(3, pelanggan.getNoTelp());
            int rowsInserted = statement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Get all pelanggan from the database
    public List<Pelanggan> getAllPelanggan() {
        List<Pelanggan> pelangganList = new ArrayList<>();
        String query = "SELECT * FROM pelanggan";

        try (Connection connection = DatabaseConnection.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String nama = resultSet.getString("Pelanggan_nama");
                String alamat = resultSet.getString("Pelanggan_alamat");
                String noTelp = resultSet.getString("Pelanggan_notelp");

                Pelanggan pelanggan = new Pelanggan(nama, alamat, noTelp);
                pelangganList.add(pelanggan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pelangganList;
    }
    
    public boolean deletePelangganByDetails(String nama, String alamat, String noTelp) {
        String query = "DELETE FROM pelanggan WHERE Pelanggan_nama = ? AND Pelanggan_alamat = ? AND Pelanggan_notelp = ?";
        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, nama);
            statement.setString(2, alamat);
            statement.setString(3, noTelp);
            int rowsAffected = statement.executeUpdate();

            return rowsAffected > 0; // Return true if at least one row was deleted
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
        public Pelanggan getPelangganByNama(String nama) {
        Pelanggan pelanggan = null;
        String query = "SELECT * FROM pelanggan WHERE Pelanggan_nama = ?";

        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nama);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                String alamat = resultSet.getString("Pelanggan_alamat");
                String noTelp = resultSet.getString("Pelanggan_notelp");

                pelanggan = new Pelanggan(nama, alamat, noTelp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return pelanggan;
    }
    }

