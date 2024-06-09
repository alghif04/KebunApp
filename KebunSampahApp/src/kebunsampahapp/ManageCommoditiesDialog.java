package kebunsampahapp;


import dao.DetailPesananDAO;
import dao.KomoditiDAO; // Import the class containing getHargaFromSelectedCommodity
import dao.PesananDAO;

import entities.DetailPesanan;
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import dao.PelangganDAO;
import entities.Pelanggan;
import entities.Pesanan;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import dao.KomoditiDAO;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ibadj
 */
public class ManageCommoditiesDialog extends JDialog  {
    private List<DetailPesanan> detailList;
    private double totalHarga;
    private DetailPesananDAO detailPesananDAO;
    private String pesananId;
    private List<Komoditi> komoditiList;
    private DefaultTableModel tableModel;
    private PesananDAO pesananDAO;
    /**
     * Creates new form ManageCommoditiesDialog
     */
    public ManageCommoditiesDialog(Frame parent, String pesananId) {
        super(parent, "Manage Commodities", true);
        initComponents();
         pesananDAO = new PesananDAO(DatabaseConnection.getConnection());        
        this.pesananId = pesananId;
        detailPesananDAO = new DetailPesananDAO();
         tableModel = new DefaultTableModel();
         

        // Initialize komoditiList and load commodities into comboBoxKomoditi
        KomoditiDAO komoditiDAO = new KomoditiDAO();
        komoditiList = komoditiDAO.getAllKomoditi();
        populateKomoditi();
         populateTable(pesananId);
         checkAndDisableFieldsIfLunas();
    }
    
        // Constructor used when opening the dialog from the main application

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        comboBoxKomoditi = new javax.swing.JComboBox<>();
        tfQuantity = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDetails = new javax.swing.JTable();
        btnAddKomoditi = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        tfGrandTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnConvertToPDF = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        comboBoxKomoditi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        tableDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Pesanan", "Nama Komoditi", "Harga", "Kuantitas", "Total Harga Item"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableDetails);

        btnAddKomoditi.setBackground(new java.awt.Color(0, 102, 102));
        btnAddKomoditi.setForeground(new java.awt.Color(255, 255, 255));
        btnAddKomoditi.setText("Tambah");
        btnAddKomoditi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddKomoditiActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 0, 0));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        tfGrandTotal.setEditable(false);

        jLabel2.setText("Pilih Komoditi");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jLabel3.setText("Total");

        jLabel4.setText("Kuantitas");

        btnConvertToPDF.setBackground(new java.awt.Color(0, 102, 102));
        btnConvertToPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnConvertToPDF.setText("Cetak PDF");
        btnConvertToPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertToPDFActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Detail Pesanan");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(258, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(251, 251, 251))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxKomoditi, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddKomoditi))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConvertToPDF)
                        .addGap(13, 13, 13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxKomoditi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddKomoditi))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton)
                    .addComponent(btnConvertToPDF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfGrandTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddKomoditiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddKomoditiActionPerformed
        // TODO add your handling code here:
     addCommodity();
      populateTable(pesananId);
    }//GEN-LAST:event_btnAddKomoditiActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
     int selectedRow = tableDetails.getSelectedRow();

    if (selectedRow != -1) {
        DefaultTableModel tableModel = (DefaultTableModel) tableDetails.getModel();
        String pesananId = (String) tableModel.getValueAt(selectedRow, 0); // Assuming pesanan_id is in column 0
        String komoditiNama = (String) tableModel.getValueAt(selectedRow, 1); // Assuming komoditi_nama is in column 1

        DetailPesananDAO detailPesananDAO = new DetailPesananDAO();
        boolean deleted = detailPesananDAO.deleteDetailByPesananIdAndKomoditiNama(pesananId, komoditiNama);

        if (deleted) {
            tableModel.removeRow(selectedRow);
            System.out.println("Row deleted successfully!");
        } else {
            System.out.println("Failed to delete row!");
        }
    } else {
        System.out.println("No row selected!");
    }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void btnConvertToPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConvertToPDFActionPerformed
        // Create a new document
        Document document = new Document(PageSize.A4, 50, 50, 30, 50); // Adjust margins as needed

        try {
            // Set the PDF file name to be the order ID
            String fileName = "order_invoices/" + pesananId + ".pdf";  // Assuming 'order_invoices' is the directory name
            File file = new File(fileName);
            file.getParentFile().mkdirs();  // Create directories if they don't exist
            PdfWriter.getInstance(document, new FileOutputStream(fileName));

            // Open the document
            document.open();

            // Fetch order details
            List<DetailPesanan> details = detailPesananDAO.getDetailsByPesananId(pesananId);
            PesananDAO pesananDAO = new PesananDAO(DatabaseConnection.getConnection());
            Pesanan pesanan = pesananDAO.getPesananById(pesananId);  // Fetch the order details from the database

            // Fetch customer details based on pesanan_nama (foreign key)
            PelangganDAO pelangganDAO = new PelangganDAO();
            Pelanggan pelanggan = pelangganDAO.getPelangganByNama(pesanan.getPesananNama()); // Assuming you have this method in PelangganDAO

            // Create table for layout
            PdfPTable mainTable = new PdfPTable(2);
            mainTable.setWidthPercentage(100);

            // Create cell for customer details
            PdfPCell customerCell = new PdfPCell();
            customerCell.setBorder(PdfPCell.NO_BORDER);
            customerCell.addElement(new Paragraph("Kepada:"));
            customerCell.addElement(new Paragraph("Nama Pelanggan: " + pelanggan.getNama()));
            customerCell.addElement(new Paragraph("Alamat: " + pelanggan.getAlamat()));
            customerCell.addElement(new Paragraph("No. Telp: " + pelanggan.getNoTelp()));
            mainTable.addCell(customerCell);

            // Create cell for order details
            PdfPCell orderCell = new PdfPCell();
            orderCell.setBorder(PdfPCell.NO_BORDER);
            Paragraph idParagraph = new Paragraph("ID: " + pesananId);
            idParagraph.setAlignment(Element.ALIGN_RIGHT); // Justify to the right
            orderCell.addElement(idParagraph);

            Paragraph dateParagraph = new Paragraph("Tanggal: " + java.time.LocalDate.now());
            dateParagraph.setAlignment(Element.ALIGN_RIGHT); // Justify to the right
            orderCell.addElement(dateParagraph);

            mainTable.addCell(orderCell);

            // Add the main table to the document
            document.add(mainTable);

            // Add space between customer contact details and table
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" "));
            

            // Add table headers
            PdfPTable table = new PdfPTable(4); // 4 columns: Komoditi, Harga, Jumlah, Total Harga
            table.setWidthPercentage(100); // Set table width to 100% of the page
            table.addCell("Komoditi");
            table.addCell("Harga");
            table.addCell("Jumlah");
            table.addCell("Total Harga");

            double grandTotal = 0.0;
            for (DetailPesanan detail : details) {
                String komoditiNama = detail.getKomoditiNama();
                double harga = detail.getKomoditiHarga();
                double jumlah = detail.getJumlah();
                double totalHargaItem = harga * jumlah;
                grandTotal += totalHargaItem;

                // Add order details to table
                table.addCell(komoditiNama);
                table.addCell(String.valueOf(harga));
                table.addCell(String.valueOf(jumlah));
                table.addCell(String.valueOf(totalHargaItem));
            }

            // Add the table to the document
            document.add(table);

            // Add grand total
            document.add(new Paragraph(" "));
            document.add(new Paragraph("Grand Total: " + String.format("%.2f", grandTotal)));

            // Add space between table and payment details
            document.add(new Paragraph(" "));
            document.add(new Paragraph(" ")); // Add additional space here

            // Add payment details
            document.add(new Paragraph("Pembayaran"));
            document.add(new Paragraph("A/n John Doe"));
            document.add(new Paragraph("Central Bank - 12345678910"));

            // Adding space and John Doe's name in bold, underlined, and centered
            document.add(new Paragraph(" "));
            Paragraph johnDoeParagraph = new Paragraph("John Doe");
            johnDoeParagraph.setAlignment(Element.ALIGN_CENTER);
            johnDoeParagraph.getFont().setStyle(Font.BOLD | Font.UNDERLINE);
            document.add(johnDoeParagraph);

            // Adding the thank you note
            Paragraph thankYouParagraph = new Paragraph("Terima kasih telah berbelanja di tempat kami");
            thankYouParagraph.setAlignment(Element.ALIGN_CENTER);
            document.add(thankYouParagraph);

            // Close the document
            document.close();

            System.out.println("PDF created successfully. Location: " + fileName);

            // Automatically open the PDF
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnConvertToPDFActionPerformed
private void addCommodity() {
    String selectedCommodity = comboBoxKomoditi.getSelectedItem().toString();
    double quantity = Double.parseDouble(tfQuantity.getText()); // Use double for quantity

    KomoditiDAO komoditiDAO = new KomoditiDAO();
    double komoditiHarga = komoditiDAO.getHargaFromSelectedCommodity(selectedCommodity);
    double totalHarga = komoditiHarga * quantity; // Calculate the total price based on the quantity

    try (Connection connection = DatabaseConnection.getConnection()) {
        // Check if the commodity already exists for the same pesanan_id
        String checkQuery = "SELECT jumlah, komoditi_harga FROM detailpesanan WHERE pesanan_id = ? AND komoditi_nama = ?";
        try (PreparedStatement checkStmt = connection.prepareStatement(checkQuery)) {
            checkStmt.setString(1, pesananId);
            checkStmt.setString(2, selectedCommodity);
            ResultSet resultSet = checkStmt.executeQuery();

            if (resultSet.next()) {
                // Commodity exists, update the quantity and price
                double existingQuantity = resultSet.getDouble("jumlah");
                double newQuantity = existingQuantity + quantity;

                String updateQuery = "UPDATE detailpesanan SET jumlah = ?, komoditi_harga = ? WHERE pesanan_id = ? AND komoditi_nama = ?";
                try (PreparedStatement updateStmt = connection.prepareStatement(updateQuery)) {
                    updateStmt.setDouble(1, newQuantity);
                    updateStmt.setDouble(2, komoditiHarga);
                    updateStmt.setString(3, pesananId);
                    updateStmt.setString(4, selectedCommodity);
                    updateStmt.executeUpdate();
                    System.out.println("Commodity quantity and price updated successfully!");
                }
            } else {
                // Commodity does not exist, insert a new row
                String insertQuery = "INSERT INTO detailpesanan (pesanan_id, komoditi_nama, komoditi_harga, jumlah) VALUES (?, ?, ?, ?)";
                try (PreparedStatement insertStmt = connection.prepareStatement(insertQuery)) {
                    insertStmt.setString(1, pesananId);
                    insertStmt.setString(2, selectedCommodity);
                    insertStmt.setDouble(3, komoditiHarga);
                    insertStmt.setDouble(4, quantity);
                    insertStmt.executeUpdate();
                    System.out.println("Commodity added successfully!");
                }
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}





     private void saveCommodities() {
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            String komoditiNama = (String) tableModel.getValueAt(i, 0);
            double harga = (double) tableModel.getValueAt(i, 1);
            int jumlah = (int) tableModel.getValueAt(i, 2);

            DetailPesanan detail = new DetailPesanan(0, pesananId, komoditiNama, harga, jumlah);
            detailPesananDAO.addDetailPesanan(detail);
        }

        // Additional save actions if needed
;
    }
     
    private void updateTable() {
        // Populate the table with existing details if any (from database)
        detailList = detailPesananDAO.getDetailsByPesananId(pesananId);
        for (DetailPesanan detail : detailList) {
            Object[] rowData = {
                    detail.getKomoditiNama(),
                    detail.getKomoditiHarga(),
                    detail.getJumlah(),
                    detail.getKomoditiHarga() * detail.getJumlah()
            };
            tableModel.addRow(rowData);
            totalHarga += detail.getKomoditiHarga() * detail.getJumlah();
        }
    }
private void populateKomoditi() {
    Collections.sort(komoditiList, new Comparator<Komoditi>() {
        @Override
        public int compare(Komoditi k1, Komoditi k2) {
            return k1.getNama().compareTo(k2.getNama());
        }
    });

    comboBoxKomoditi.removeAllItems(); // Clear existing items in the dropdown
    for (Komoditi komoditi : komoditiList) {
        comboBoxKomoditi.addItem(komoditi.getNama()); // Add the name of the commodity to the dropdown
    }
}
private void populateTable(String pesananId) {
    DefaultTableModel tableModel = (DefaultTableModel) tableDetails.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    List<DetailPesanan> details = detailPesananDAO.getDetailsByPesananId(pesananId);

    Map<String, Double> commodityQuantities = new HashMap<>();
    Map<String, Double> commodityPrices = new HashMap<>();
    double grandTotal = 0.0;

    for (DetailPesanan detail : details) {
        String komoditiNama = detail.getKomoditiNama();
        double jumlah = detail.getJumlah();
        double harga = detail.getKomoditiHarga();

        commodityPrices.put(komoditiNama, harga);

        if (commodityQuantities.containsKey(komoditiNama)) {
            commodityQuantities.put(komoditiNama, commodityQuantities.get(komoditiNama) + jumlah);
        } else {
            commodityQuantities.put(komoditiNama, jumlah);
        }
    }

    int macamKomoditiCount = commodityQuantities.size(); // Count of unique komoditi entries

    for (String komoditiNama : commodityQuantities.keySet()) {
        double jumlah = commodityQuantities.get(komoditiNama);
        double harga = commodityPrices.get(komoditiNama);
        double totalHargaItem = harga * jumlah;
        grandTotal += totalHargaItem;

        Object[] rowData = {pesananId, komoditiNama, harga, jumlah, totalHargaItem}; // Include pesananId as the first column
        tableModel.addRow(rowData);
    }

    // Set the grand total in tfGrandTotal
    tfGrandTotal.setText(String.format("%.2f", grandTotal));

    // Update the Pesanan_totalharga and Pesanan_macamkomoditi in the pesanan table
    PesananDAO pesananDAO = new PesananDAO(DatabaseConnection.getConnection());
    pesananDAO.updatePesanan(pesananId, grandTotal, macamKomoditiCount);
}


     private void checkAndDisableFieldsIfLunas() {
        // Retrieve the pesanan status from the database
        Pesanan pesanan = pesananDAO.getPesananById(pesananId);

        // Check if the status is 'lunas'
        if ("lunas".equalsIgnoreCase(pesanan.getPesananStatus())) {
            setFieldsEnabled(false);
        }
    }

    private void setFieldsEnabled(boolean enabled) {
        tfQuantity.setEnabled(enabled);
        comboBoxKomoditi.setEnabled(enabled);
    }




    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageCommoditiesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCommoditiesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCommoditiesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCommoditiesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton btnAddKomoditi;
    private javax.swing.JButton btnConvertToPDF;
    private javax.swing.JComboBox<String> comboBoxKomoditi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableDetails;
    private javax.swing.JTextField tfGrandTotal;
    private javax.swing.JTextField tfQuantity;
    // End of variables declaration//GEN-END:variables
}
