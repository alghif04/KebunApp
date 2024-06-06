/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kebunappgui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;



/**
 *
 * @author ibadj
 */
public class KebunTambahPesanan extends javax.swing.JFrame {

    private Vector<Vector> dataPelanggan; // Define TabelPelanggan as a class variable
    private Vector<Vector> dataPesanan; // Define TabelPesanan as a class variable
    /**
     * Creates new form KebunTambahPesanan
     */
    public KebunTambahPesanan() {
        initComponents();
         populatePelangganDropdown();
         
         
        TabelPesanan.getColumnModel().getColumn(5).setCellRenderer(new ButtonRenderer());
        TabelPesanan.getColumnModel().getColumn(5).setCellEditor(new ButtonEditor());
  
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
        javax.swing.JButton BackButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfNoTelp = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        tfTanggal = new com.toedter.calendar.JDateChooser();
        javax.swing.JButton TambahItemButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        dropdownPelanggan = new javax.swing.JComboBox<>();
        javax.swing.JButton DeleteButton = new javax.swing.JButton();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelPesanan = new javax.swing.JTable();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        tfFrom = new com.toedter.calendar.JDateChooser();
        tfTo = new com.toedter.calendar.JDateChooser();
        javax.swing.JButton SortButton = new javax.swing.JButton();
        SortClearButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Tambah Pesanan");

        jLabel2.setText("Nama Pelanggan");

        jLabel3.setText("Tanggal");

        tfNoTelp.setEditable(false);

        tfAlamat.setEditable(false);

        TambahItemButton.setBackground(new java.awt.Color(51, 51, 255));
        TambahItemButton.setForeground(new java.awt.Color(255, 255, 255));
        TambahItemButton.setText("+ Tambah Item");
        TambahItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahItemButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        tfID.setEditable(false);

        dropdownPelanggan.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dropdownPelangganItemStateChanged(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(255, 0, 51));
        DeleteButton.setForeground(new java.awt.Color(255, 255, 255));
        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 153, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Selesai");

        TabelPesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Tanggal", "Macam Komoditi", "Total Harga", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelPesanan);

        jLabel7.setText("From");

        jLabel8.setText("To");

        SortButton.setBackground(new java.awt.Color(51, 102, 0));
        SortButton.setForeground(new java.awt.Color(255, 255, 255));
        SortButton.setText("Sort");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });

        SortClearButton.setBackground(new java.awt.Color(204, 0, 51));
        SortClearButton.setForeground(new java.awt.Color(255, 255, 255));
        SortClearButton.setText("Clear");
        SortClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortClearButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BackButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TambahItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dropdownPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(SortClearButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SortButton))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(DeleteButton)
                            .addGap(43, 43, 43)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(tfTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(SortButton)
                                .addComponent(SortClearButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(DeleteButton)
                                .addComponent(jButton1)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))))
                    .addComponent(tfFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addComponent(dropdownPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TambahItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(110, 110, 110))
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
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // Create an instance of MainWindow
        saveTableToFile();
    KebunWindow KebunWindow = new KebunWindow();

    // Set the new window to be visible
    KebunWindow.setVisible(true);

    // Dispose of the current window (CurrentWindow.java)
    this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BackButtonActionPerformed

    private void TambahItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahItemButtonActionPerformed
        Object selectedItem = dropdownPelanggan.getSelectedItem();
        if (selectedItem instanceof Pelanggan) {
            Pelanggan pelanggan = (Pelanggan) selectedItem;
            String namaPelanggan = pelanggan.getNama();
            String alamatPelanggan = pelanggan.getAlamat();
            String noTelpPelanggan = pelanggan.getNoTelp();
            
            // Get the selected date from your JDatePicker
            Date selectedDate = tfTanggal.getDate();
            if (selectedDate == null) {
                JOptionPane.showMessageDialog(this, "Please select a date.");
                return;
            }
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(selectedDate);
            int month = calendar.get(Calendar.MONTH) + 1; // Months are 0-based in Calendar
            int year = calendar.get(Calendar.YEAR);
            
            // Proceed with adding the data to TabelPesanan
            DefaultTableModel model = (DefaultTableModel) TabelPesanan.getModel();
            int maxSequenceNumber = 0;
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-yyyy");
            String targetMonthYear = String.format("%02d-%04d", month, year);
            
            for (int i = 0; i < model.getRowCount(); i++) {
                String existingId = (String) model.getValueAt(i, 0); // Assuming the ID is in the first column
                String[] parts = existingId.split("/");
                if (parts.length == 3 && parts[2].equals(targetMonthYear)) {
                    int sequenceNumber = Integer.parseInt(parts[0]);
                    if (sequenceNumber > maxSequenceNumber) {
                        maxSequenceNumber = sequenceNumber;
                    }
                }
            }
            
            // Increment the sequence number
            int newSequenceNumber = maxSequenceNumber + 1;
            
            // Format the date as required
            String formattedDate = String.format("%02d/Kebun/%02d-%04d", newSequenceNumber, month, year);
            
            // Format the selected date
            String formattedSelectedDate = new SimpleDateFormat("dd/MM/yyyy").format(selectedDate);
            
            // Add the collected data as a new row to TabelPesanan
            JButton actionButton = new JButton("Action");
            model.addRow(new Object[]{formattedDate, namaPelanggan, alamatPelanggan, null, null, actionButton}); // ID is inserted into the first column
            
            // Save the updated table to a binary file
            saveTableToFile();
        } else {
            // Handle the case where selectedItem is not an instance of Pelanggan
            // For example, show an error message or log a warning
            System.err.println("Selected item is not an instance of Pelanggan.");
        }
    }//GEN-LAST:event_TambahItemButtonActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
    // Get the date range from the JDateChooser components
    Date fromDate = tfFrom.getDate();
    Date toDate = tfTo.getDate();

    // Check if both dates are selected
    if (fromDate == null || toDate == null) {
        JOptionPane.showMessageDialog(this, "Please select both From and To dates.");
        return;
    }

    // Filter the table rows based on the date range
    DefaultTableModel model = (DefaultTableModel) TabelPesanan.getModel();
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Format for date only

    for (int i = model.getRowCount() - 1; i >= 0; i--) {
        String dateString = (String) model.getValueAt(i, 2); // Assuming date is in the third column
        try {
            Date date = dateFormat.parse(dateString);
            if (date.before(fromDate) || date.after(toDate)) {
                model.removeRow(i);
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
            // Handle parsing exception if needed
        }
    }
    }//GEN-LAST:event_SortButtonActionPerformed

    private void SortClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortClearButtonActionPerformed
    loadTableFromFile();
    }//GEN-LAST:event_SortClearButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       int row =TabelPesanan.getSelectedRow();
       
       if (row < 0){
           JOptionPane.showMessageDialog(this, "Tidak ada baris yang di-select", "Pilih baris", JOptionPane.ERROR_MESSAGE);
       } else {
           DefaultTableModel model = (DefaultTableModel) TabelPesanan.getModel();
           model.removeRow(row);
       }
    saveTableToFile();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    saveTableToFile();
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       loadTableFromFile();
    }//GEN-LAST:event_formWindowOpened

    private void dropdownPelangganItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dropdownPelangganItemStateChanged
     if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
        Pelanggan selectedPelanggan = (Pelanggan) dropdownPelanggan.getSelectedItem();
        if (selectedPelanggan != null) {
            tfAlamat.setText(selectedPelanggan.getAlamat());
            tfNoTelp.setText(selectedPelanggan.getNoTelp());
        }
    }
    }//GEN-LAST:event_dropdownPelangganItemStateChanged
   private void loadTableFromFile() {
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tabelPesanan.bin"))) {
        Vector<Vector> dataVector = (Vector<Vector>) ois.readObject();
        DefaultTableModel model = (DefaultTableModel) TabelPesanan.getModel();
        
        // Clear the current table content
        model.setRowCount(0);
        
        // Add the original data back to the table
        for (Vector row : dataVector) {
            model.addRow(row.toArray());
        }
        
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error reloading table data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void saveTableToFile() {
    try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TabelPesanan.bin"))) {
        DefaultTableModel model = (DefaultTableModel) TabelPesanan.getModel();
        Vector<Vector> dataVector = model.getDataVector();
        oos.writeObject(dataVector);
        JOptionPane.showMessageDialog(this, "Data saved successfully!");
    } catch (IOException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error saving data: " + e.getMessage());
    }
    }                          
 
         private void populatePelangganDropdown() {
        List<Pelanggan> pelangganList = PelangganLoader.loadPelangganFromBinFile("TabelPelanggan.bin");

        DefaultComboBoxModel<Pelanggan> pelangganModel = new DefaultComboBoxModel<>();
        for (Pelanggan pelanggan : pelangganList) {
            pelangganModel.addElement(pelanggan); // Add the whole Pelanggan object
        }

        dropdownPelanggan.setModel(pelangganModel);
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
            java.util.logging.Logger.getLogger(KebunTambahPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KebunTambahPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KebunTambahPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KebunTambahPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KebunTambahPesanan().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SortClearButton;
    private javax.swing.JTable TabelPesanan;
    private javax.swing.JComboBox<Pelanggan> dropdownPelanggan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfAlamat;
    private com.toedter.calendar.JDateChooser tfFrom;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNoTelp;
    private com.toedter.calendar.JDateChooser tfTanggal;
    private com.toedter.calendar.JDateChooser tfTo;
    // End of variables declaration//GEN-END:variables
}
