import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Nov 07 21:04:20 IST 2023
 */



/**
 * @author Aniket
 */
public class AdmissionEnquiryPanel extends JFrame {
    public AdmissionEnquiryPanel() {
        initComponents();
        setSize();
        setVisbility(true)
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Aniekt Gavande
        ComputerScience = new JButton();
        InformationTechnology = new JButton();
        Mechanical = new JButton();
        label1 = new JLabel();

        //======== this ========
        setTitle("AdmissionEnquiyPortal");
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- ComputerScience ----
        ComputerScience.setText("ComputerScience");
        ComputerScience.setBackground(new Color(0x990099));
        ComputerScience.setForeground(new Color(0x99ffff));
        contentPane.add(ComputerScience);
        ComputerScience.setBounds(55, 80, 195, 50);

        //---- InformationTechnology ----
        InformationTechnology.setText("Information Technology");
        InformationTechnology.setBackground(new Color(0xff33ff));
        InformationTechnology.setForeground(new Color(0x99ffff));
        contentPane.add(InformationTechnology);
        InformationTechnology.setBounds(90, 185, 195, 50);

        //---- Mechanical ----
        Mechanical.setText("Mechanical");
        Mechanical.setBackground(new Color(0xff99ff));
        Mechanical.setForeground(new Color(0x99ffff));
        contentPane.add(Mechanical);
        Mechanical.setBounds(140, 280, 195, 50);

        //---- label1 ----
        label1.setIcon(new ImageIcon("C:\\Users\\Aniket\\Pictures\\Screenshots\\Screenshot 2023-11-06 181425.png"));
        contentPane.add(label1);
        label1.setBounds(0, 0, 475, 415);

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
    private JButton ComputerScience;
    private JButton InformationTechnology;
    private JButton Mechanical;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

}
