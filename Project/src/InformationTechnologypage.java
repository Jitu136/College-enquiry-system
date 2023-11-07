import Project.DatabaseConnection;

import java.awt.*;
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

        //---- IT_FEESSTRUCTURE ----
        IT_FEESSTRUCTURE.setText("IT_CUTOFF_CAP1");
        IT_FEESSTRUCTURE.setBackground(new Color(0x3399ff));
        contentPane.add(IT_FEESSTRUCTURE);
        IT_FEESSTRUCTURE.setBounds(145, 165, 155, 35);

        //---- IT_CUTOFF_CAP1 ----
        IT_CUTOFF_CAP1.setText("IT_CUTOFF_CAP3");
        IT_CUTOFF_CAP1.setBackground(new Color(0x99ffff));
        contentPane.add(IT_CUTOFF_CAP1);
        IT_CUTOFF_CAP1.setBounds(145, 280, 155, 40);

        //---- IT_CUTOFF_CAP2 ----
        IT_CUTOFF_CAP2.setText("IT_FEESSTRUCTURE");
        IT_CUTOFF_CAP2.setBackground(new Color(0x0066ff));
        contentPane.add(IT_CUTOFF_CAP2);
        IT_CUTOFF_CAP2.setBounds(140, 105, 165, 40);

        //---- IT_CUTOFF_CAP3 ----
        IT_CUTOFF_CAP3.setText("IT_CUTOFF_CAP2");
        IT_CUTOFF_CAP3.setBackground(new Color(0x66ccff));
        contentPane.add(IT_CUTOFF_CAP3);
        IT_CUTOFF_CAP3.setBounds(145, 220, 154, 40);

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

    public void getConnection(){
        DbConnection = new DatabaseConnection();
        DbConnection.getConnection();
    }

    public void closeConnection(){
        DbConnection.closeConnection();
    }


}
