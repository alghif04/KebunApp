/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.kebunappgui;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ibadj
 */
public class KebunDaftarPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form KebunDaftarPelanggan
     */
    public KebunDaftarPelanggan() {
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

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        TfNomorTelepon = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        TfNamaPelanggan = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        TfAlamat = new javax.swing.JTextField();
        javax.swing.JButton TambahPelangganButton = new javax.swing.JButton();
        javax.swing.JButton ClearButton = new javax.swing.JButton();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        javax.swing.JButton BackButton = new javax.swing.JButton();
        javax.swing.JButton DeleteButton = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        TabelPelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Daftar Pelanggan");

        jLabel3.setText("Nomor Telepon");

        TfNomorTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNomorTeleponActionPerformed(evt);
            }
        });

        jLabel4.setText("Nama Pelanggan");

        TfNamaPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfNamaPelangganActionPerformed(evt);
            }
        });

        jLabel5.setText("Alamat");

        TfAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TfAlamatActionPerformed(evt);
            }
        });

        TambahPelangganButton.setBackground(new java.awt.Color(51, 153, 255));
        TambahPelangganButton.setForeground(new java.awt.Color(255, 255, 255));
        TambahPelangganButton.setText("Tambah Pelanggan");
        TambahPelangganButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TambahPelangganButtonActionPerformed(evt);
            }
        });

        ClearButton.setBackground(new java.awt.Color(204, 0, 0));
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Manajemen Kebun \\ Daftar Pelanggan");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        TabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No Telp", "Alamat"
            }
        ));
        jScrollPane1.setViewportView(TabelPelanggan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TambahPelangganButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(TfNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TfNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(TfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(231, 231, 231)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(11, 11, 11))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2))
                    .addComponent(BackButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(15, 15, 15)
                .addComponent(DeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfNomorTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TambahPelangganButton)
                            .addComponent(ClearButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
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

    private void TfNomorTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNomorTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNomorTeleponActionPerformed

    private void TfNamaPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfNamaPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfNamaPelangganActionPerformed

    private void TfAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TfAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TfAlamatActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) TabelPelanggan.getModel();
    Vector<Vector> dataPelanggan = model.getDataVector();

    try {
        FileOutputStream file = new FileOutputStream("TabelPelanggan.bin");
        ObjectOutputStream output = new ObjectOutputStream(file);

        output.writeObject(dataPelanggan);

        output.close();
        file.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    // Create an instance of MainWindow
    KebunWindow KebunWindow = new KebunWindow();

    // Set the new window to be visible
    KebunWindow.setVisible(true);

    // Dispose of the current window (CurrentWindow.java)
    this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
       int row =TabelPelanggan.getSelectedRow();
       
       if (row < 0){
           JOptionPane.showMessageDialog(this, "Tidak ada baris yang di-select", "Pilih baris", JOptionPane.ERROR_MESSAGE);
       } else {
           DefaultTableModel model = (DefaultTableModel) TabelPelanggan.getModel();
           model.removeRow(row);
       }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void TambahPelangganButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TambahPelangganButtonActionPerformed
        String namaPelanggan = TfNamaPelanggan.getText();
        String nomorTelepon = TfNomorTelepon.getText();
        String alamat = TfAlamat.getText();
        
        if (namaPelanggan.isEmpty() || nomorTelepon.isEmpty() || alamat.isEmpty() ){
            JOptionPane.showMessageDialog(this, "Harap kolom diisi", "Coba lagi", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel model  = (DefaultTableModel) TabelPelanggan.getModel();
            model.addRow(new Object[]{namaPelanggan, nomorTelepon, alamat});
            
            TfNamaPelanggan.setText("");
            TfNomorTelepon.setText("");
            TfAlamat.setText("");
        }
    }//GEN-LAST:event_TambahPelangganButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
            TfNamaPelanggan.setText("");
            TfNomorTelepon.setText("");
            TfAlamat.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    DefaultTableModel model = (DefaultTableModel) TabelPelanggan.getModel();
    Vector<Vector> dataPelanggan = model.getDataVector();

    try {
        FileOutputStream file = new FileOutputStream("TabelPelanggan.bin");
        ObjectOutputStream output = new ObjectOutputStream(file);

        output.writeObject(dataPelanggan);

        output.close();
        file.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    try {
        FileInputStream file = new FileInputStream("TabelPelanggan.bin");
        ObjectInputStream input = new ObjectInputStream(file);

        Vector<Vector> dataPelanggan = (Vector<Vector>) input.readObject();
        DefaultTableModel model = (DefaultTableModel) TabelPelanggan.getModel();
        
        for (Vector row : dataPelanggan) {
            model.addRow(row.toArray());
        }

        input.close();
        file.close();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(KebunDaftarPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KebunDaftarPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KebunDaftarPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KebunDaftarPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KebunDaftarPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelPelanggan;
    private javax.swing.JTextField TfAlamat;
    private javax.swing.JTextField TfNamaPelanggan;
    private javax.swing.JTextField TfNomorTelepon;
    // End of variables declaration//GEN-END:variables
}