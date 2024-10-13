package basicFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setTitle("Epic Title");
        frame.setSize(420, 420);
        frame.setVisible(true);

        ImageIcon icon = new ImageIcon("src/icon.png");
        frame.setIconImage(icon.getImage());
        frame.getContentPane().setBackground(Color.BLUE);
    }
}