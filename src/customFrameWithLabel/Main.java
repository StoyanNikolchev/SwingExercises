package customFrameWithLabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);

        JLabel label = new JLabel();
        label.setBorder(border);

        ImageIcon icon = new ImageIcon("src/icon.png");
        label.setIcon(icon);
        label.setText("This is some of the text of all time.");

        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);

        label.setForeground(Color.BLUE);
        label.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        label.setIconTextGap(25);

        label.setBackground(Color.ORANGE);
        label.setOpaque(true);

        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);

        CustomFrame frame = new CustomFrame();
        frame.add(label);
        frame.pack();
    }
}
