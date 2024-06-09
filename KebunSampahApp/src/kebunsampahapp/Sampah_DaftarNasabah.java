/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
    /*
 */
package kebunsampahapp;

import javax.swing.*;
import dao.NasabahDAO;
import entities.Nasabah;
import javax.swing.JButton;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Sampah_DaftarNasabah extends javax.swing.JFrame {

    private NasabahDAO nasabahDAO;

    public Sampah_DaftarNasabah() {
        initComponents();
        nasabahDAO = new NasabahDAO();
        showNasabah();// Inisialisasi objek NasabahDAO
    }

    private void addNasabah() {
    String nama = tfNama.getText();
    String status = tfStatus.getText();
    String nomorRumahText = tfNomor_Rumah.getText().trim();  // Menghilangkan spasi di depan dan belakang

    // Validasi input nomor rumah
    int nomorRumah;
    try {
        nomorRumah = Integer.parseInt(nomorRumahText);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Nomor Rumah harus berupa angka", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validasi input nama dan status
    if (nama.isEmpty() || status.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Membuat objek Nasabah dan menyimpannya ke database
    Nasabah nasabah = new Nasabah(nama, status, nomorRumah);
    nasabahDAO.addNasabah(nasabah);
    JOptionPane.showMessageDialog(this, "A new nasabah was inserted successfully!");

    // Membersihkan field setelah penyimpanan
    tfNama.setText("");
    tfStatus.setText("");
    tfNomor_Rumah.setText("");
}
    private void showNasabah() {
    DefaultTableModel model = (DefaultTableModel) TabelNasabah.getModel();
    model.setRowCount(0); // Hapus semua baris yang ada sebelum menambahkan baris baru

    NasabahDAO nasabahDAO = new NasabahDAO();
    ResultSet rs = nasabahDAO.getNasabah();

    try {
        while (rs.next()) {
            String nama = rs.getString("nasabah_nama");
            String status = rs.getString("nasabah_status");
            int nomorRumah = rs.getInt("nasabah_nomor_rumah");
            model.addRow(new Object[]{nama, status, nomorRumah});
        }
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

        private void deleteNasabahActionPerformed() {
        int selectedRow = TabelNasabah.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) TabelNasabah.getModel();
            String nama = model.getValueAt(selectedRow, 0).toString();
            String status = model.getValueAt(selectedRow, 1).toString();
            int nomorRumah = Integer.parseInt(model.getValueAt(selectedRow, 2).toString());

            NasabahDAO nasabahDAO = new NasabahDAO();
            nasabahDAO.deleteNasabahByDetails(nama, status, nomorRumah);

            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to delete", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
        


    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelNasabah = new javax.swing.JTable();
        javax.swing.JButton DeleteButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        SetoranButton = new javax.swing.JButton();
        NasabahButton = new javax.swing.JButton();
        BSISButton = new javax.swing.JButton();
        DaftarHargaButton = new javax.swing.JButton();
        LaporanSetoranButton = new javax.swing.JButton();
        MainMenuButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        tfNama = new javax.swing.JTextField();
        Nama = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        Status = new javax.swing.JLabel();
        tfNomor_Rumah = new javax.swing.JTextField();
        Nomor_Rumah = new javax.swing.JLabel();
        javax.swing.JButton ClearButton = new javax.swing.JButton();
        javax.swing.JButton AddNasabahButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(777, 518));

        TabelNasabah.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "Status", "Nomor Rumah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelNasabah);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Bumi Hijau");

        SetoranButton.setBackground(new java.awt.Color(204, 255, 0));
        SetoranButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/shopping-cart.png"))); // NOI18N
        SetoranButton.setText("Setoran");
        SetoranButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        SetoranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetoranButtonActionPerformed(evt);
            }
        });

        NasabahButton.setBackground(new java.awt.Color(204, 255, 0));
        NasabahButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/man.png"))); // NOI18N
        NasabahButton.setText("Daftar Nasabah");
        NasabahButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        NasabahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NasabahButtonActionPerformed(evt);
            }
        });

        BSISButton.setBackground(new java.awt.Color(204, 255, 0));
        BSISButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/wheat.png"))); // NOI18N
        BSISButton.setText("Penjualan ke BSIS");
        BSISButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BSISButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSISButtonActionPerformed(evt);
            }
        });

        DaftarHargaButton.setBackground(new java.awt.Color(204, 255, 0));
        DaftarHargaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/tag.png"))); // NOI18N
        DaftarHargaButton.setText("Daftar Harga");
        DaftarHargaButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        DaftarHargaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DaftarHargaButtonActionPerformed(evt);
            }
        });

        LaporanSetoranButton.setBackground(new java.awt.Color(204, 255, 0));
        LaporanSetoranButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/seo-report.png"))); // NOI18N
        LaporanSetoranButton.setText("Laporan Setoran");
        LaporanSetoranButton.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LaporanSetoranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LaporanSetoranButtonActionPerformed(evt);
            }
        });

        MainMenuButton1.setBackground(new java.awt.Color(204, 255, 0));
        MainMenuButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/back.png"))); // NOI18N
        MainMenuButton1.setText("Main Menu");
        MainMenuButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        MainMenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NasabahButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BSISButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DaftarHargaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LaporanSetoranButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(41, 41, 41))
            .addComponent(MainMenuButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(SetoranButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addComponent(NasabahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSISButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DaftarHargaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LaporanSetoranButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(MainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(149, 149, 149)
                    .addComponent(SetoranButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Daftar Nasabah", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 0, 36))); // NOI18N
        jPanel2.setOpaque(false);

        Nama.setText("Nama");

        Status.setText("Status");

        Nomor_Rumah.setText("Nomor Rumah");

        ClearButton.setBackground(new java.awt.Color(255, 0, 0));
        ClearButton.setForeground(new java.awt.Color(255, 255, 255));
        ClearButton.setText("Clear");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        AddNasabahButton.setBackground(new java.awt.Color(0, 102, 153));
        AddNasabahButton.setForeground(new java.awt.Color(255, 255, 255));
        AddNasabahButton.setText("+ Add Nasabah");
        AddNasabahButton.setMaximumSize(new java.awt.Dimension(115, 23));
        AddNasabahButton.setMinimumSize(new java.awt.Dimension(115, 23));
        AddNasabahButton.setPreferredSize(new java.awt.Dimension(115, 23));
        AddNasabahButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNasabahButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nama))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nomor_Rumah)
                            .addComponent(tfNomor_Rumah, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(ClearButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddNasabahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama)
                    .addComponent(Nomor_Rumah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNomor_Rumah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(Status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ClearButton)
                    .addComponent(AddNasabahButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(70, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(DeleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        // TODO add your handling code here:
        deleteNasabahActionPerformed();
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void AddNasabahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNasabahButtonActionPerformed
        // TODO add your handling code here:
        addNasabah();
        showNasabah();
    }//GEN-LAST:event_AddNasabahButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void SetoranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetoranButtonActionPerformed
        Sampah_Setoran Sampah_Setoran = new Sampah_Setoran();

        // Set the new window to be visible
        Sampah_Setoran.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_SetoranButtonActionPerformed

    private void NasabahButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NasabahButtonActionPerformed
        Sampah_DaftarNasabah  Sampah_DaftarNasabah = new  Sampah_DaftarNasabah();

        // Set the new window to be visible
         Sampah_DaftarNasabah.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();
    }//GEN-LAST:event_NasabahButtonActionPerformed

    private void BSISButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSISButtonActionPerformed
 
    }//GEN-LAST:event_BSISButtonActionPerformed

    private void DaftarHargaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DaftarHargaButtonActionPerformed
  
    }//GEN-LAST:event_DaftarHargaButtonActionPerformed

    private void LaporanSetoranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LaporanSetoranButtonActionPerformed
        Sampah_LaporanSetoran Sampah_LaporanSetoran = new Sampah_LaporanSetoran();

        // Set the new window to be visible
        Sampah_LaporanSetoran.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_LaporanSetoranButtonActionPerformed

    private void MainMenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButton1ActionPerformed
        MainWindow MainWindow = new MainWindow();

        // Set the new window to be visible
        MainWindow.setVisible(true);

        // Dispose of the current window (CurrentWindow.java)
        this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_MainMenuButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sampah_DaftarNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sampah_DaftarNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sampah_DaftarNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sampah_DaftarNasabah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sampah_DaftarNasabah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BSISButton;
    private javax.swing.JButton DaftarHargaButton;
    private javax.swing.JButton LaporanSetoranButton;
    private javax.swing.JButton MainMenuButton1;
    private javax.swing.JLabel Nama;
    private javax.swing.JButton NasabahButton;
    private javax.swing.JLabel Nomor_Rumah;
    private javax.swing.JButton SetoranButton;
    javax.swing.JLabel Status;
    private javax.swing.JTable TabelNasabah;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNomor_Rumah;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
}
