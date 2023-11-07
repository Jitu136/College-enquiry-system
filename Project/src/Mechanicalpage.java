import Project.DatabaseConnection;

import java.awt.*;
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

        //---- Mech_FEESSTRUCTURE ----
        Mech_FEESSTRUCTURE.setText("Mech_CUTOFF_CAP1");
        Mech_FEESSTRUCTURE.setBackground(new Color(0xcc9900));
        contentPane.add(Mech_FEESSTRUCTURE);
        Mech_FEESSTRUCTURE.setBounds(new Rectangle(new Point(155, 210), Mech_FEESSTRUCTURE.getPreferredSize()));

        //---- Mech_CUTOFF_CAP1 ----
        Mech_CUTOFF_CAP1.setText("Mech_FEESSTRUCTURE");
        Mech_CUTOFF_CAP1.setBackground(new Color(0xcc6600));
        contentPane.add(Mech_CUTOFF_CAP1);
        Mech_CUTOFF_CAP1.setBounds(new Rectangle(new Point(145, 135), Mech_CUTOFF_CAP1.getPreferredSize()));

        //---- Mech_CUTOFF_CAP2 ----
        Mech_CUTOFF_CAP2.setText("Mech_CUTOFF_CAP3");
        Mech_CUTOFF_CAP2.setBackground(new Color(0xffff99));
        contentPane.add(Mech_CUTOFF_CAP2);
        Mech_CUTOFF_CAP2.setBounds(new Rectangle(new Point(160, 345), Mech_CUTOFF_CAP2.getPreferredSize()));

        //---- Mech_CUTOFF_CAP3 ----
        Mech_CUTOFF_CAP3.setText("Mech_CUTOFF_CAP2");
        Mech_CUTOFF_CAP3.setBackground(new Color(0xffcc00));
        contentPane.add(Mech_CUTOFF_CAP3);
        Mech_CUTOFF_CAP3.setBounds(new Rectangle(new Point(160, 275), Mech_CUTOFF_CAP3.getPreferredSize()));

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

    public void getConnection(){
        DbConnection = new DatabaseConnection();
        DbConnection.getConnection();
    }

    public void closeConnection(){
        DbConnection.closeConnection();
    }
}
