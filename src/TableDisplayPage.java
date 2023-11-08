import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class TableDisplayPage extends JFrame {
    public TableDisplayPage(List<String[]> data) {
        // Set the JFrame properties
        setTitle("Table Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);

        // Create a DefaultTableModel to hold your data
        DefaultTableModel model = new DefaultTableModel();

        // Assuming that the first row of data contains the column names
        String[] columnNames = data.get(0);
        for (String columnName : columnNames) {
            model.addColumn(columnName);
        }

        // Add data to the table model (excluding the first row which is column names)
        for (int i = 1; i < data.size(); i++) {
            String[] rowData = data.get(i);
            model.addRow(rowData);
        }

        // Create a JTable with the model
        JTable table = new JTable(model);

        // Create a JScrollPane to hold the table
        JScrollPane scrollPane = new JScrollPane(table);

        // Add the JScrollPane to the JFrame
        add(scrollPane);

        // Make the frame visible
        setVisible(true);
    }

}
