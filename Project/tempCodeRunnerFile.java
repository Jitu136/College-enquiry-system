import java.awt.*;
import javax.swing.*;

public class AdmissionEnquiryPanel extends JFrame {

    private JButton ComputerScience;
    private JButton InformationTechnology;
    private JButton Mechanical;
    private JLabel label1;

    public AdmissionEnquiryPanel() {
        initComponents();
    }
   
    private void initComponents() {
        ComputerScience = new JButton();
        InformationTechnology = new JButton();
        Mechanical = new JButton();
        label1 = new JLabel();

        setTitle("Admission Enquiry Portal");
        setLayout(null);

        ComputerScience.setText("Computer Science");
        ComputerScience.setBackground(new Color(0x99ffff));
        ComputerScience.setForeground(new Color(0x99ffff));
        add(ComputerScience);
        ComputerScience.setBounds(55, 60, 195, 50);
        ComputerScience.addActionListener(e -> {
            new ComputerSciencePage();
        });

        InformationTechnology.setText("Information Technology");
        InformationTechnology.setBackground(new Color(0x99ffff));
        InformationTechnology.setForeground(new Color(0x99ffff));
        add(InformationTechnology);
        InformationTechnology.setBounds(55, 185, 195, 50);

        Mechanical.setText("Mechanical");
        Mechanical.setBackground(new Color(0x99ffff));
        Mechanical.setForeground(new Color(0x99ffff));
        add(Mechanical);
        Mechanical.setBounds(55, 310, 195, 50);

        label1.setIcon(new ImageIcon("C:\\Users\\Aniket\\Pictures\\Screenshots\\Screenshot 2023-11-06 181425.png"));
        add(label1);
        label1.setBounds(0, 0, 475, 415);

        Dimension preferredSize = new Dimension();
        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            Rectangle bounds = getContentPane().getComponent(i).getBounds();
            preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
            preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
        }

        getContentPane().setMinimumSize(preferredSize);
        getContentPane().setPreferredSize(preferredSize);
        pack();
        setLocationRelativeTo(getOwner());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AdmissionEnquiryPanel obj = new AdmissionEnquiryPanel();
            obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            obj.setVisible(true);
        });
    }

}
