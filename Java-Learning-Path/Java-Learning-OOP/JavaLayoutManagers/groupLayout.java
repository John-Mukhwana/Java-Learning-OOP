
package JavaLayoutManagers;
import javax.swing.*;
import javax.swing.GroupLayout;

public class groupLayout {
    public class GroupLayoutExample {
        public static void main(String[] args) {
            JFrame frame = new JFrame("GroupLayout Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300);
            
            JPanel panel = new JPanel();
            GroupLayout layout = new GroupLayout(panel);
            panel.setLayout(layout);
            layout.setAutoCreateGaps(true);
            layout.setAutoCreateContainerGaps(true);
            
            JButton btn1 = new JButton("Button 1");
            JButton btn2 = new JButton("Button 2");
            JButton btn3 = new JButton("Button 3");
            
            layout.setHorizontalGroup(
                layout.createSequentialGroup()
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
            );
            
            layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1)
                    .addComponent(btn2)
                    .addComponent(btn3)
            );
            
            frame.add(panel);
            frame.setVisible(true);
        }
    }
}
