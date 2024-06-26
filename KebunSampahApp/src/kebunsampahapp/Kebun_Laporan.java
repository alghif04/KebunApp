/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kebunsampahapp;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author ibadj
 */
public class Kebun_Laporan extends javax.swing.JFrame {

    /**
     * Creates new form Kebun_Laporan
     */
    public Kebun_Laporan() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        TambahPesananButton = new javax.swing.JButton();
        DaftarPelangganButton = new javax.swing.JButton();
        DaftarKomoditiButton = new javax.swing.JButton();
        LaporanPanenButton = new javax.swing.JButton();
        LaporanPenjualanButton = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fromDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        toDateChooser = new com.toedter.calendar.JDateChooser();
        filterButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Bumi Hijau");

        TambahPesananButton.setBackground(new java.awt.Color(204, 255, 0));
        TambahPesananButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/shopping-cart.png"))); // NOI18N
        TambahPesananButton.setText("Tambah Pesanan");
        TambahPesananButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        TambahPesananButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahPesananButtonActionPerformed(evt);
            }
        });

        DaftarPelangganButton.setBackground(new java.awt.Color(204, 255, 0));
        DaftarPelangganButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/man.png"))); // NOI18N
        DaftarPelangganButton.setText("Daftar Pelanggan");
        DaftarPelangganButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        DaftarPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarPelangganButtonActionPerformed(evt);
            }
        });

        DaftarKomoditiButton.setBackground(new java.awt.Color(204, 255, 0));
        DaftarKomoditiButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/wheat.png"))); // NOI18N
        DaftarKomoditiButton.setText("Daftar Komoditi");
        DaftarKomoditiButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        DaftarKomoditiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarKomoditiButtonActionPerformed(evt);
            }
        });

        LaporanPanenButton.setBackground(new java.awt.Color(204, 255, 0));
        LaporanPanenButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/report.png"))); // NOI18N
        LaporanPanenButton.setText("Laporan Panen");
        LaporanPanenButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LaporanPanenButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPanenButtonActionPerformed(evt);
            }
        });

        LaporanPenjualanButton.setBackground(new java.awt.Color(204, 255, 0));
        LaporanPenjualanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/seo-report.png"))); // NOI18N
        LaporanPenjualanButton.setText("Laporan Penjualan");
        LaporanPenjualanButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LaporanPenjualanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanPenjualanButtonActionPerformed(evt);
            }
        });

        MainMenuButton.setBackground(new java.awt.Color(204, 255, 0));
        MainMenuButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        MainMenuButton.setText("Main Menu");
        MainMenuButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DaftarPelangganButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DaftarKomoditiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LaporanPanenButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LaporanPenjualanButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(41, 41, 41))
            .addComponent(MainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(TambahPesananButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(DaftarPelangganButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DaftarKomoditiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaporanPanenButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaporanPenjualanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(TambahPesananButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Laporan Penjualan", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 36))); // NOI18N
        jPanel2.setOpaque(false);

        jLabel2.setText("Dari ");

        filterButton.setBackground(new java.awt.Color(0, 102, 102));
        filterButton.setForeground(new java.awt.Color(255, 255, 255));
        filterButton.setText("Filter");
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Sampai");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(filterButton)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fromDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterButton))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
       calculateSales();
    }//GEN-LAST:event_filterButtonActionPerformed

    private void TambahPesananButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahPesananButtonActionPerformed
        Kebun_TambahPesanan KebunTambahPesanan = new Kebun_TambahPesanan();

        // Set the new window to be visible
        KebunTambahPesanan.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_TambahPesananButtonActionPerformed

    private void DaftarPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarPelangganButtonActionPerformed
        Kebun_DaftarPelanggan Kebun_DaftarPelanggan = new Kebun_DaftarPelanggan();

        // Set the new window to be visible
        Kebun_DaftarPelanggan.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();
    }//GEN-LAST:event_DaftarPelangganButtonActionPerformed

    private void DaftarKomoditiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarKomoditiButtonActionPerformed
        Kebun_DaftarKomoditi Kebun_DaftarKomoditi = new Kebun_DaftarKomoditi();

        // Set the new window to be visible
        Kebun_DaftarKomoditi.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_DaftarKomoditiButtonActionPerformed

    private void LaporanPenjualanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPenjualanButtonActionPerformed
        Kebun_Laporan Kebun_Laporan = new Kebun_Laporan();

        // Set the new window to be visible
        Kebun_Laporan.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_LaporanPenjualanButtonActionPerformed

    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed
        MainWindow MainWindow = new MainWindow();

        // Set the new window to be visible
        MainWindow.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_MainMenuButtonActionPerformed

    private void LaporanPanenButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanPanenButtonActionPerformed
     Kebun_LaporanPanen Kebun_LaporanPanen = new Kebun_LaporanPanen();

        // Set the new window to be visible
        Kebun_LaporanPanen.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:   // TODO add your handling code here:        // TODO add your handling code here:
    }//GEN-LAST:event_LaporanPanenButtonActionPerformed
private void calculateSales() {
    double totalSales = 0.0;
    DefaultPieDataset dataset = new DefaultPieDataset();

    Date fromDate = fromDateChooser.getDate();
    Date toDate = toDateChooser.getDate();

    if (fromDate == null || toDate == null) {
        JOptionPane.showMessageDialog(this, "Please select both from and to dates.");
        return;
    }

    try (Connection connection = DatabaseConnection.getConnection()) {
        // Fetch Pesanan_id values where status is 'lunas' within the specified date range
        PreparedStatement pesananIdStatement = connection.prepareStatement("SELECT Pesanan_id FROM Pesanan WHERE Pesanan_status = 'lunas' AND Pesanan_tanggal BETWEEN ? AND ?");
        pesananIdStatement.setDate(1, new java.sql.Date(fromDate.getTime()));
        pesananIdStatement.setDate(2, new java.sql.Date(toDate.getTime()));
        ResultSet pesananIdResultSet = pesananIdStatement.executeQuery();

        while (pesananIdResultSet.next()) {
            String pesananId = pesananIdResultSet.getString("Pesanan_id");

            // Fetch komoditi data for each Pesanan_id from DetailPesanan
            PreparedStatement komoditiStatement = connection.prepareStatement("SELECT Komoditi_nama, Komoditi_harga, Jumlah FROM DetailPesanan WHERE Pesanan_id = ?");
            komoditiStatement.setString(1, pesananId);
            ResultSet komoditiResultSet = komoditiStatement.executeQuery();

            while (komoditiResultSet.next()) {
                String komoditiNama = komoditiResultSet.getString("Komoditi_nama");
                double komoditiHarga = komoditiResultSet.getDouble("Komoditi_harga");
                int jumlah = komoditiResultSet.getInt("Jumlah");
                double totalHargaItem = komoditiHarga * jumlah;

                totalSales += totalHargaItem;
                dataset.setValue(komoditiNama, totalHargaItem);
            }
        }

    } catch (SQLException e) {
        e.printStackTrace();
        return;
    }

    // Debug statements
    System.out.println("Total Sales: " + totalSales);
    System.out.println("Dataset Size: " + dataset.getItemCount());

    // Create title for the chart including total sales and period
    String chartTitle = String.format("Sales Distribution (Total Sales: %.2f, Period: %tF to %tF)", totalSales, fromDate, toDate);

    JFreeChart chart = ChartFactory.createPieChart(
            chartTitle,
            dataset,
            true,
            true,
            false
    );

    PiePlot plot = (PiePlot) chart.getPlot();
    plot.setCircular(true);
    plot.setLabelGap(0.02);

    System.out.println("Chart created: " + chart.getTitle().getText());

    // Create a new JFrame for the chart
    JFrame chartFrame = new JFrame("Sales Distribution Chart");
    chartFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new Dimension(400, 300)); // Set preferred size for the chart panel
    chartFrame.getContentPane().add(chartPanel, BorderLayout.CENTER);

    // Display the value of individual commodities below the chart
    JPanel valuePanel = new JPanel();
    JLabel valueLabel = new JLabel("Data Komoditi:");
    valuePanel.add(valueLabel);
    for (Object key : dataset.getKeys()) {
        String commodityName = (String) key;
        double commodityValue = dataset.getValue(commodityName).doubleValue();
        JLabel commodityLabel = new JLabel(commodityName + ": " + commodityValue);
        valuePanel.add(commodityLabel);
    }
    chartFrame.getContentPane().add(valuePanel, BorderLayout.SOUTH);

    chartFrame.pack();
    chartFrame.setLocationRelativeTo(null);
    chartFrame.setVisible(true);
}




 
    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Kebun_Laporan frame = new Kebun_Laporan();
            frame.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DaftarKomoditiButton;
    private javax.swing.JButton DaftarPelangganButton;
    private javax.swing.JButton LaporanPanenButton;
    private javax.swing.JButton LaporanPenjualanButton;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton TambahPesananButton;
    private javax.swing.JButton filterButton;
    private com.toedter.calendar.JDateChooser fromDateChooser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser toDateChooser;
    // End of variables declaration//GEN-END:variables
}
