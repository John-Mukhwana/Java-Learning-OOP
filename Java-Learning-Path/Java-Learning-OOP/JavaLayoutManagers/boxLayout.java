package JavaLayoutManagers;

import javax.swing.*;
import java.awt.*;

public class boxLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical BoxLayout Example");
        // Set BoxLayout for vertical alignment
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Add buttons to the frame
        frame.add(new JButton("Button 1"));
         // Add vertical space between buttons
        frame.add(Box.createRigidArea(new Dimension(0, 10)));
        frame.add(new JButton("Button 2"));
        // Add vertical space between buttons
        frame.add(Box.createRigidArea(new Dimension(0, 10))); 
        frame.add(new JButton("Button 3"));

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
