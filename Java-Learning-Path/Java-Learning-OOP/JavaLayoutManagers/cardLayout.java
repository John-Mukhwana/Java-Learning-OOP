package JavaLayoutManagers;
import javax.swing.*;
import java.awt.*;
public class cardLayout {
    public static void main(String[] args){
         JFrame frame=new JFrame("Card Layout");

         //Creating a CardLayout 
            CardLayout cardLayout=new CardLayout();
            JPanel panel=new JPanel(cardLayout);

            //creating two cards panels with buttons
            JPanel card1=new JPanel();
            card1.add(new JLabel("Card 1"));
            card1.add(new JButton("Button 1"));

            JPanel card2=new JPanel();
            card2.add(new JLabel("Card 2"));
            card2.add(new JButton("Button 2"));

            //adding cards to the panel
            panel.add(card1,"Card 1");
            panel.add(card2,"Card 2");

            //show the first card
            cardLayout.show(panel,"Card 1");

            //adding the panel to the frame
            frame.add(panel);

            frame.setSize(300,300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
    }
    
}
