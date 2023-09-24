import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello, Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setLayout(new FlowLayout());
        
        JButton clickMeButton = new JButton("Click Me");
        
        clickMeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Hello, Swing!");
            }
        });

        frame.add(clickMeButton);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
