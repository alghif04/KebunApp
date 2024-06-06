package com.mycompany.kebunappgui;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.AbstractCellEditor;
import javax.swing.table.TableCellEditor;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {
    protected JButton button;
    private String label;
    private boolean isPushed;
    private String orderID; // Add this line

    public ButtonEditor() {
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(this);
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        label = (value == null) ? "Add Item" : value.toString();
        button.setText(label);
        isPushed = true;
        
        // Get the order ID from the table
        orderID = table.getValueAt(row, 0).toString(); // Assuming order ID is in the first column
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        if (isPushed) {
            try {
                // Open the new frame with order ID
                KebunDetailPesanan detailPesananFrame = new KebunDetailPesanan(orderID); // Pass order ID to the frame
                detailPesananFrame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        isPushed = false;
        return label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        fireEditingStopped();
    }
}
