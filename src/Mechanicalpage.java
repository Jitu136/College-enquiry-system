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
 * Created by JFormDesigner on Tue Nov 07 18:33:02 IST 2023
 */



/**
 * @author Aniket
 */
public class Mechanicalpage extends JFrame {
    DatabaseConnection DbConnection;
    public Mechanicalpage() {
        initComponents();
        setVisible(true);
        setSize(475, 475 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Aniekt Gavande
        Mech_placement = new JButton();
        Mech_FEESSTRUCTURE = new JButton();
        Mech_CUTOFF_CAP1 = new JButton();
        Mech_CUTOFF_CAP2 = new JButton();
        Mech_CUTOFF_CAP3 = new JButton();
        label1 = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- Mech_placement ----
        Mech_placement.setText("Mech_placement");
        Mech_placement.setBackground(new Color(0xcc0033));
        contentPane.add(Mech_placement);
        Mech_placement.setBounds(175, 65, 125, Mech_placement.getPreferredSize().height);
        Mech_placement.addActionListener(e -> {
            List<String[]> MechPLacement = getMECHPlacementData();
            String[] mechPlacementFields = {
                    "mech_placement_id",
                    "academic_year",
                    "number_of_student_placed",
                    "Highest_package_in_lpa",
                    "Avg_package_in_lpa"
            };

            MechPLacement.add(0, mechPlacementFields );
            TableDisplayPage obj = new TableDisplayPage(MechPLacement);

        });

        //---- Mech_FEESSTRUCTURE ----
        Mech_FEESSTRUCTURE.setText("Mech_CUTOFF_CAP1");
        Mech_FEESSTRUCTURE.setBackground(new Color(0xcc9900));
        contentPane.add(Mech_FEESSTRUCTURE);
        Mech_FEESSTRUCTURE.setBounds(new Rectangle(new Point(155, 210), Mech_FEESSTRUCTURE.getPreferredSize()));
        Mech_FEESSTRUCTURE.addActionListener( e-> {

            List<String[]> MechPreviousYearCap1 = getMECHPreviousYearCutoffCap1();

            String[] mechPreviousYearCutoffCap1Fields = {
                    "mech_serial_id",
                    "category",
                    "marks"
            };

            MechPreviousYearCap1.add(0, mechPreviousYearCutoffCap1Fields);
            TableDisplayPage obj = new TableDisplayPage(MechPreviousYearCap1);
        });

        //---- Mech_CUTOFF_CAP1 ----
        Mech_CUTOFF_CAP1.setText("Mech_FEESSTRUCTURE");
        Mech_CUTOFF_CAP1.setBackground(new Color(0xcc6600));
        contentPane.add(Mech_CUTOFF_CAP1);
        Mech_CUTOFF_CAP1.setBounds(new Rectangle(new Point(145, 135), Mech_CUTOFF_CAP1.getPreferredSize()));
        Mech_CUTOFF_CAP1.addActionListener( e-> {
            List<String[]> MechFees = getMECHFeesStructures();
            String[] mechFeesStructureFields = {
                    "mech_fees_structure_id",
                    "category",
                    "tution_fees",
                    "development_fees",
                    "eligibility_fees",
                    "exam_fees",
                    "misc_univ_fees",
                    "total_rs"
            };

            MechFees.add(0, mechFeesStructureFields);
            TableDisplayPage obj = new TableDisplayPage(MechFees);

        });

        //---- Mech_CUTOFF_CAP2 ----
        Mech_CUTOFF_CAP2.setText("Mech_CUTOFF_CAP3");
        Mech_CUTOFF_CAP2.setBackground(new Color(0xffff99));
        contentPane.add(Mech_CUTOFF_CAP2);
        Mech_CUTOFF_CAP2.setBounds(new Rectangle(new Point(160, 345), Mech_CUTOFF_CAP2.getPreferredSize()));
        Mech_CUTOFF_CAP2.addActionListener( e-> {
            List<String[]> MechPreviousYearCap2 = getMECHPreviousYearCutoffCap3();
            String[] mechPreviousYearCutoffCap1Fields = {
                    "mech_serial_id",
                    "category",
                    "marks"
            };

            MechPreviousYearCap2.add(0, mechPreviousYearCutoffCap1Fields);
            TableDisplayPage obj = new TableDisplayPage(MechPreviousYearCap2);

        });

        //---- Mech_CUTOFF_CAP3 ----
        Mech_CUTOFF_CAP3.setText("Mech_CUTOFF_CAP2");
        Mech_CUTOFF_CAP3.setBackground(new Color(0xffcc00));
        contentPane.add(Mech_CUTOFF_CAP3);
        Mech_CUTOFF_CAP3.setBounds(new Rectangle(new Point(160, 275), Mech_CUTOFF_CAP3.getPreferredSize()));
        Mech_CUTOFF_CAP3.addActionListener( e-> {
            List<String[]> MechPreviousYearCap3 = getMECHPreviousYearCutoffCap2();
            String[] mechPreviousYearCutoffCap1Fields = {
                    "mech_serial_id",
                    "category",
                    "marks"
            };

            MechPreviousYearCap3.add(0, mechPreviousYearCutoffCap1Fields);
            TableDisplayPage obj = new TableDisplayPage(MechPreviousYearCap3);

        });

        //---- label1 ----
        label1.setText("text");
        label1.setIcon(new ImageIcon("C:\\Users\\Aniket\\Pictures\\Screenshots\\Screenshot 2023-11-06 181425.png"));
        contentPane.add(label1);
        label1.setBounds(0, -30, 485, 505);

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
    private JButton Mech_placement;
    private JButton Mech_FEESSTRUCTURE;
    private JButton Mech_CUTOFF_CAP1;
    private JButton Mech_CUTOFF_CAP2;
    private JButton Mech_CUTOFF_CAP3;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args){
        Mechanicalpage obj = new Mechanicalpage();
    }

    public void openDatabaseConnection(){
        DbConnection = new DatabaseConnection();
        DbConnection.getConnection();
    }

    public void closeDatabaseConnection(){
        DbConnection.closeConnection();
    }

    private java.util.List<String[]> getMECHFeesStructures() {
        java.util.List<String[]> structures = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM mech_fees_structure";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] structure = {
                            String.valueOf(resultSet.getInt("mech_fees_structure_id")),
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
    private java.util.List<String[]> getMECHPlacementData() {
        java.util.List<String[]> placementData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM mech_placement";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("mech_placement_id")),
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


    private java.util.List<String[]> getMECHPreviousYearCutoffCap1() {
        java.util.List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM mech_previousyear_cutoff_cap1";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("mech_serial_id")),
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

    private java.util.List<String[]> getMECHPreviousYearCutoffCap2() {
        java.util.List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM mech_previousyear_cutoff_cap2";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("mech_serial_id")),
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

    private java.util.List<String[]> getMECHPreviousYearCutoffCap3() {
        List<String[]> cutoffData = new ArrayList<>();
        openDatabaseConnection();
        try {
            String query = "SELECT * FROM mech_previousyear_cutoff_cap3";
            try (PreparedStatement preparedStatement = DbConnection.getConnection().prepareStatement(query)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    String[] data = {
                            String.valueOf(resultSet.getInt("mech_serial_id")),
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
