import javax.swing.*;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login basico");
        frame.setContentPane(new Login().login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}