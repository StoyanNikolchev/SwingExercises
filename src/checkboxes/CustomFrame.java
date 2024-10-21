package checkboxes;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {

    public CustomFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Checkboxes");
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Submit");

        JCheckBox checkBox = new JCheckBox("Yeah?");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 50));

        button.addActionListener(listener -> {
            if (listener.getSource() == button) {
                System.out.println(checkBox.isSelected());
                checkBox.setEnabled(false);
            }
        });

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }
}
