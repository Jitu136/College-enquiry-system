import Project.DatabaseConnection;

import java.awt.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import Project.DatabaseConnection;
/*
 * Created by JFormDesigner on Tue Nov 07 18:21:25 IST 2023
 */



/**
 * @author Aniket
 */
public class InformationTechnologypage extends JFrame {
    DatabaseConnection DbConnection;
    public InformationTechnologypage() {
        initComponents();
        setVisible(true);
        setSize(475, 475 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Aniekt Gavande
        IT_placement = new JButton();
        IT_FEESSTRUCTURE = new JButton();
        IT_CUTOFF_CAP1 = new JButton();
        IT_CUTOFF_CAP2 = new JButton();
        IT_CUTOFF_CAP3 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- IT_placement ----
        IT_placement.setText("IT_placement");
        IT_placement.setBackground(new Color(0x0000cc));
        contentPane.add(IT_placement);
        IT_placement.setBounds(155, 45, 140, 40);
        IT_placement.addActionListener(e -> {
            List<String[]>    IT_Placement = getITPlacementData();
            String[] itPlacementFields = {
                    "it_placement_id",
                    "academic_year",
                    "number_of_student_placed",
                    "Highest_package_in_lpa",
                    "Avg_package_in_lpa"
            };
            IT_Placement.add(0,itPlacementFields);
            TableDisplayPage obj = new TableDisplayPage(IT_Placement);
        });

        //---- IT_FEESSTRUCTURE ----
        IT_FEESSTRUCTURE.setText("IT_CUTOFF_CAP1");
        IT_FEESSTRUCTURE.setBackground(new Color(0x3399ff));
        contentPane.add(IT_FEESSTRUCTURE);
        IT_FEESSTRUCTURE.setBounds(145, 165, 155, 35);
        IT_FEESSTRUCTURE.addActionListener(e -> {
            List<String[]>   IT_CUTOFF_CAP1 =  getITPreviousYearCutoffCap1();
            String[] itPreviousYearCutoffCap1Fields = {
                    "it_serial_id",
                    "category",
                    "marks"
            };
            IT_CUTOFF_CAP1.add(0,itPreviousYearCutoffCap1Fields);
            TableDisplayPage obj = new TableDisplayPage(IT_CUTOFF_CAP1);
        });
        //---- IT_CUTOFF_CAP1 ----
        IT_CUTOFF_CAP1.setText(" IT_CUTOFF_CAP3");
        IT_CUTOFF_CAP1.setBackground(new Color(0x99ffff));
        contentPane.add(IT_CUTOFF_CAP1);
        IT_CUTOFF_CAP1.setBounds(145, 280, 155, 40);
        IT_CUTOFF_CAP1.addActionListener(e -> {
            List<String[]>   IT_CUTOFF_CAP3 =  getITPreviousYearCutoffCap3();
            String[] itPreviousYearCutoffCap2Fields = {
                    "it_serial_id",
                    "category",
                    "marks"
            };
            IT_CUTOFF_CAP3.add(0,itPreviousYearCutoffCap2Fields);
            TableDisplayPage obj = new TableDisplayPage(IT_CUTOFF_CAP3);


        });
        //---- IT_CUTOFF_CAP2 ----
        IT_CUTOFF_CAP2.setText(" IT_FEES_STRUCTURE");
        IT_CUTOFF_CAP2.setBackground(new Color(0x0066ff));
        contentPane.add(IT_CUTOFF_CAP2);
        IT_CUTOFF_CAP2.setBounds(140, 105, 165, 40);
        IT_CUTOFF_CAP2.addActionListener(e -> {
            List<String[]>    IT_FEESSTRUCTURE =  getITFeesStructures();
            String[] itFeesStructureFields = {
                    "it_fees_structure_id",
                    "category",
                    "tution_fees",
                    "development_fees",
                    "eligibility_fees",
                    "exam_fees",
                    "misc_univ_fees",
                    "total_rs"
            };
            IT_FEESSTRUCTURE.add(0,itFeesStructureFields);
            TableDisplayPage obj = new TableDisplayPage(IT_FEESSTRUCTURE);

        });
        //---- IT_CUTOFF_CAP3 ----
        IT_CUTOFF_CAP3.setText(" IT_CUTOFF_CAP2");
        IT_CUTOFF_CAP3.setBackground(new Color(0x66ccff));
        contentPane.add(IT_CUTOFF_CAP3);
        IT_CUTOFF_CAP3.setBounds(145, 220, 154, 40);
        IT_CUTOFF_CAP3.addActionListener(e -> {
            List<String[]>   IT_CUTOFF_CAP2 =  getITPreviousYearCutoffCap2();
            String[] itPreviousYearCutoffCap2Fields = {
                    "it_serial_id",
                    "category",
                    "marks"
            };
            IT_CUTOFF_CAP2.add(0,itPreviousYearCutoffCap2Fields);
            TableDisplayPage obj = new TableDisplayPage(IT_CUTOFF_CAP2);

        });
        //---- label1 ----
        label1.setText("text");
        label1.setIcon(new ImageIcon("C:\\Users\\Aniket\\Pictures\\Screenshots\\Screenshot 2023-11-06 181425.png"));
        contentPane.add(label1);
        label1.setBounds(0, -25, 480, 400);

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
    private JButton IT_placement;
    private JButton IT_FEESSTRUCTURE;
    private JButton IT_CUTOFF_CAP1;
    private JButton IT_CUTOFF_CAP2;
    private JButton IT_CUTOFF_CAP3;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args){
        InformationTechnologypage obj = new InformationTechnologypage();
    }

    public void openDatabaseConnection(){
        DbConnection = new DatabaseConnection();
        DbConnection.getConnection();
    }

    public void closeDatabaseConnection(){
        DbConnection.closeConnection();
    }

    private java.util.List<String[]> getITFeesStructures() {
        java.util.List<String[]> structures = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM it_fees_structure";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] structure = {
                            String.valueOf(resultSet.getInt("it_fees_structure_id")),
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
    private java.util.List<String[]> getITPlacementData() {
        java.util.List<String[]> placementData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM it_placement";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("it_placement_id")),
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


    private java.util.List<String[]> getITPreviousYearCutoffCap1() {
        java.util.List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM it_previousyear_cutoff_cap1";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("it_serial_id")),
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

    private java.util.List<String[]> getITPreviousYearCutoffCap2() {
        java.util.List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM it_previousyear_cutoff_cap2";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("it_serial_id")),
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

    private java.util.List<String[]> getITPreviousYearCutoffCap3() {
        List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM it_previousyear_cutoff_cap3";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("it_serial_id")),
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
