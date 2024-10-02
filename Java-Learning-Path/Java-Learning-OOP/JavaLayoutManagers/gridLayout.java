

package JavaLayoutManagers;
import javax.swing.*;
import java.awt.*;

public class gridLayout {
    public static void main(String[] ags){
        JFrame frame=new JFrame("Grid Layout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        frame.setLayout(new GridLayout(2,3));
        // frame.add(new JButton("Button 1"));
        // frame.add(new JButton("Button 2"));
        // frame.add(new JButton("Button 3"));
        // frame.add(new JButton("Button 4"));
        // frame.add(new JButton("Button 5"));
        // frame.add(new JButton("Button 6"));

        // Adding six buttons to the grid using a loop
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.setVisible(true);
    }
}
