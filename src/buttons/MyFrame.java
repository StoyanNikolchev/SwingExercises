package buttons;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private JButton button;
    private JLabel label;
    public MyFrame() {
        ImageIcon icon = new ImageIcon("src/icon.png");

        label = new JLabel();
        label.setBounds(150, 250, 150, 150);
        label.setIcon(icon);
        label.setVisible(false);

        button = new JButton();
        button.setBounds(0, 0, 300, 150);
        button.setText("Click Me");
        button.setIcon(icon);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans MS", Font.BOLD, 32));
        button.setForeground(Color.RED);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);

        button.addActionListener(e -> {
            System.out.println("Button works.");
            label.setVisible(true);
        });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }
}
