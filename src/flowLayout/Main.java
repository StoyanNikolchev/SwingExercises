package flowLayout;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 60));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(250, 250));
        panel.setBackground(Color.RED);
        panel.setLayout(new FlowLayout());

        panel.add(new JButton("click me"));
        panel.add(new JButton("click me 2"));
        panel.add(new JButton("click me 3"));
        panel.add(new JButton("click me 4"));
        panel.add(new JButton("click me 5"));

        frame.add(panel);
        frame.setVisible(true);
    }
}
