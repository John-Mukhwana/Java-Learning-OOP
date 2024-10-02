

package JavaLayoutManagers;
import javax.swing.*;
import javax.swing.SpringLayout;
public class springLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        SpringLayout layout = new SpringLayout();
        JPanel panel = new JPanel(layout);
        
        JButton btn1 = new JButton("Button 1");
        JButton btn2 = new JButton("Button 2");

        
        panel.add(btn1);
        panel.add(btn2);
        
        layout.putConstraint(SpringLayout.WEST, btn1, 10, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, btn1, 10, SpringLayout.NORTH, panel);
        
        layout.putConstraint(SpringLayout.WEST, btn2, 10, SpringLayout.EAST, btn1);
        layout.putConstraint(SpringLayout.NORTH, btn2, 0, SpringLayout.NORTH, btn1);
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
