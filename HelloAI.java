import java.awt.*;
import javax.swing.*;

public class HelloAI extends JPanel {
    
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(100, 100, 300, 300); // Draw the oval
        g.drawString("hello", 230, 250); // Draw the string
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello App");
        Hello panel = new Hello();
        frame.add(panel);
        frame.setSize(500, 500); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
        frame.setVisible(true); // Make the window visible
    }
}
