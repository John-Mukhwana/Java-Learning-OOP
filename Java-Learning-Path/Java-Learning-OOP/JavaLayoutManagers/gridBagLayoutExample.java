

package JavaLayoutManagers;
import javax.swing.*;
import java.awt.*;

public class gridBagLayoutExample{
    
     public static void main(String[] args) {
        JFrame frame = new JFrame("GridBagLayout Example");
        // Set GridBagLayout
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Button 1 in cell (0, 0)
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(new JButton("Button 1"), gbc);

        // Button 2 in cell (1, 0)
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(new JButton("Button 2"), gbc);

        // Button 3 spanning two columns
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        frame.add(new JButton("Button 3"), gbc);

        frame.setSize(400, 200); // Frame width and height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
