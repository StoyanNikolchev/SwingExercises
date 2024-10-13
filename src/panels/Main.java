package panels;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("src/icon.png");

        JLabel label = new JLabel("Testing, testing 1234");
        label.setIcon(icon);
        label.setBounds(100, 100, 75, 75);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 0, 250, 250);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(250, 0, 250, 250);
        redPanel.add(label);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 250, 500, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750, 750);
        frame.setVisible(true);

        frame.add(bluePanel);
        frame.add(redPanel);
        frame.add(greenPanel);
    }
}
