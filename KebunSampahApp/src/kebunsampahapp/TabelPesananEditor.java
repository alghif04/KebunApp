package kebunsampahapp;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventObject;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class TabelPesananEditor extends JButton implements TableCellEditor {
     private final JTable table;

    public TabelPesananEditor(JTable table) {
        this.table = table;
        setText("+ Item");

        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = table.convertRowIndexToModel(table.getEditingRow());
                String pesananId = (String) table.getModel().getValueAt(row, table.getColumnModel().getColumnIndex("ID"));

                // Get the parent frame of the table
                JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(table);

                // Open a dialog to manage commodities
                ManageCommoditiesDialog dialog = new ManageCommoditiesDialog(parentFrame, pesananId);
                dialog.setVisible(true);
            }
        });
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        return this;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public boolean isCellEditable(EventObject e) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean stopCellEditing() {
        return true;
    }

    @Override
    public void cancelCellEditing() {
    }

    @Override
    public void addCellEditorListener(javax.swing.event.CellEditorListener l) {
    }

    @Override
    public void removeCellEditorListener(javax.swing.event.CellEditorListener l) {
    }
}
