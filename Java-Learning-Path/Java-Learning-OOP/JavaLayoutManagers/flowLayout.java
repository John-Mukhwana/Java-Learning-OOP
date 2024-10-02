package JavaLayoutManagers;
import javax.swing.*;
import java.awt.*;

public class flowLayout {
    public static void main(String[] args){
        JFrame frame =new JFrame("Flow Layout Example");
        frame.setLayout(new FlowLayout());
        frame.setSize(400,300);

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
  /**
   * Another way to add buttons to the frame
   * you replace the above code that creates objects
   *  and define them in the frame with the below code 
   */
        // for (int i = 1; i <= 5; i++) {
        //     frame.add(new JButton("Button " + i));
        // }
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
