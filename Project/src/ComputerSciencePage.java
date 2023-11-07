import java.awt.*;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import Project.DatabaseConnection;
/*
 * Created by JFormDesigner on Mon Nov 06 18:34:26 IST 2023
 */

/**
 * @author Aniket
 */
public class ComputerSciencePage extends JFrame {
    DatabaseConnection DbConnection;
    public ComputerSciencePage() {
        initComponents();
        setVisible(true);
        setSize(475, 475 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Aniekt Gavande
        CS_placement = new JButton();
        CS_FEESSTRUCTURE = new JButton();
        CS_CUTOFF_CAP1 = new JButton();
        CS_CUTOFF_CAP2 = new JButton();
        CS_CUTOFF_CAP3 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- CS_placement ----
        CS_placement.setText("CS_placement");
        CS_placement.setBackground(new Color(0x006600));
        contentPane.add(CS_placement);
        CS_placement.setBounds(156, 35, 170, 40);
        CS_placement.addActionListener(e -> {
            getCSFeesStructures();
            getCSPlacementData();
            getCSPreviousYearCutoffCap1();
            getCSPreviousYearCutoffCap2();
            getCSPreviousYearCutoffCap3();
        });

        //---- CS_FEESSTRUCTURE ----
        CS_FEESSTRUCTURE.setText("CS_FEESSTRUCTURE");
        CS_FEESSTRUCTURE.setBackground(new Color(0x339900));
        contentPane.add(CS_FEESSTRUCTURE);
        CS_FEESSTRUCTURE.setBounds(150, 105, 180, 40);

        //---- CS_CUTOFF_CAP1 ----
        CS_CUTOFF_CAP1.setText("CS_CUTOFF_CAP1");
        CS_CUTOFF_CAP1.setBackground(Color.green);
        contentPane.add(CS_CUTOFF_CAP1);
        CS_CUTOFF_CAP1.setBounds(155, 170, 180, 40);

        //---- CS_CUTOFF_CAP2 ----
        CS_CUTOFF_CAP2.setText("CS_CUTOFF_CAP2");
        CS_CUTOFF_CAP2.setBackground(new Color(0x66ff00));
        contentPane.add(CS_CUTOFF_CAP2);
        CS_CUTOFF_CAP2.setBounds(160, 230, 170, 40);

        //---- CS_CUTOFF_CAP3 ----
        CS_CUTOFF_CAP3.setText("CS_CUTOFF_CAP3");
        CS_CUTOFF_CAP3.setBackground(new Color(0x99ff99));
        contentPane.add(CS_CUTOFF_CAP3);
        CS_CUTOFF_CAP3.setBounds(160, 295, 170, 40);

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\Aniket\\Pictures\\Screenshots\\Screenshot 2023-11-06 181425.png"));
        contentPane.add(label1);
        label1.setBounds(0, -30, 475, 455);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Aniekt Gavande
    private JButton CS_placement;
    private JButton CS_FEESSTRUCTURE;
    private JButton CS_CUTOFF_CAP1;
    private JButton CS_CUTOFF_CAP2;
    private JButton CS_CUTOFF_CAP3;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args){
        ComputerSciencePage obj = new ComputerSciencePage();

    }

    public void openDatabaseConnection(){
        DbConnection = new DatabaseConnection();
        DbConnection.getConnection();
    }

    public void closeDatabaseConnection(){
        DbConnection.closeConnection();
    }

    private List<String[]> getCSFeesStructures() {
        List<String[]> structures = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM cs_fees_structure";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] structure = {
                            String.valueOf(resultSet.getInt("cs_fees_structure_id")),
                            resultSet.getString("category"),
                            String.valueOf(resultSet.getInt("tution_fees")),
                            String.valueOf(resultSet.getInt("development_fees")),
                            String.valueOf(resultSet.getInt("eligibility_fees")),
                            String.valueOf(resultSet.getInt("exam_fees")),
                            String.valueOf(resultSet.getInt("misc_univ_fees")),
                            String.valueOf(resultSet.getInt("total_rs"))
                    };
                    System.out.println(Arrays.toString(structure));
                    structures.add(structure);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            closeDatabaseConnection();
        }
        return structures;
    }
    private List<String[]> getCSPlacementData() {
        List<String[]> placementData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM cs_placement";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("cs_placement_id")),
                            resultSet.getString("academic_year"),
                            String.valueOf(resultSet.getInt("number_of_student_placed")),
                            String.valueOf(resultSet.getInt("Highest_package_in_lpa")),
                            String.valueOf(resultSet.getInt("Avg_package_in_lpa"))
                    };
                    System.out.println(Arrays.toString(data));
                    placementData.add(data);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            closeDatabaseConnection();
        }
        return placementData;
    }


    private List<String[]> getCSPreviousYearCutoffCap1() {
        List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM cs_previousyear_cutoff_cap1";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("cs_serial_id")),
                            resultSet.getString("category"),
                            String.valueOf(resultSet.getFloat("marks"))
                    };
                    System.out.println(Arrays.toString(data));
                    cutoffData.add(data);
                }
            } catch (SQLException e) {
                System.out.println(e);
            }
        } finally {
            closeDatabaseConnection();
        }
        return cutoffData;
    }

    private List<String[]> getCSPreviousYearCutoffCap2() {
        List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM cs_previousyear_cutoff_cap2";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("cs_serial_id")),
                            resultSet.getString("category"),
                            String.valueOf(resultSet.getFloat("marks"))
                    };
                    System.out.println(Arrays.toString(data));
                    cutoffData.add(data);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            closeDatabaseConnection();
        }
        return cutoffData;
    }

    private List<String[]> getCSPreviousYearCutoffCap3() {
        List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM cs_previousyear_cutoff_cap3";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("cs_serial_id")),
                            resultSet.getString("category"),
                            String.valueOf(resultSet.getFloat("marks"))
                    };
                    System.out.println(Arrays.toString(data));
                    cutoffData.add(data);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } finally {
            closeDatabaseConnection();
        }
        return cutoffData;
    }

}

