package borderLayouts;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout(30, 30));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setPreferredSize(new Dimension(100, 50));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        panel2.setPreferredSize(new Dimension(100, 50));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.BLUE);
        panel3.setPreferredSize(new Dimension(100, 50));

        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.PINK);
        panel4.setPreferredSize(new Dimension(100, 50));

        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.CYAN);
        panel5.setPreferredSize(new Dimension(100, 50));

        // Sub panels of panel 5

        JPanel panel6 = new JPanel();
        panel6.setBackground(Color.ORANGE);
        panel6.setPreferredSize(new Dimension(20, 20));

        JPanel panel7 = new JPanel();
        panel7.setBackground(Color.BLUE);
        panel7.setPreferredSize(new Dimension(20, 20));

        JPanel panel8 = new JPanel();
        panel8.setBackground(Color.GREEN);
        panel8.setPreferredSize(new Dimension(20, 20));

        JPanel panel9 = new JPanel();
        panel9.setBackground(Color.WHITE);
        panel9.setPreferredSize(new Dimension(20, 20));

        JPanel panel10 = new JPanel();
        panel10.setBackground(Color.MAGENTA);
        panel10.setPreferredSize(new Dimension(20, 20));

        panel5.setLayout(new BorderLayout(5, 5));
        panel5.add(panel6, BorderLayout.NORTH);
        panel5.add(panel7, BorderLayout.SOUTH);
        panel5.add(panel8, BorderLayout.WEST);
        panel5.add(panel9, BorderLayout.EAST);
        panel5.add(panel10, BorderLayout.CENTER);

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.SOUTH);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.EAST);
        frame.add(panel5, BorderLayout.CENTER);
    }
}
