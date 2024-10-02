

package JavaLayoutManagers;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cardLayout{
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);
        
        cardPanel.add(new JButton("Card 1"), "Card 1");
        //setting background color of card 2
        cardPanel.getComponent(1).setBackground(Color.GREEN);
        cardPanel.add(new JButton("Card 2"), "Card 2");
        
        JButton switchButton = new JButton("Switch Card");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel);
            }
        });
        
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(switchButton, BorderLayout.SOUTH);
        
        frame.setVisible(true);
    }
}
