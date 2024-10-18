package textFields;

import javax.swing.*;
import java.awt.*;

public class CustomFrame extends JFrame {
    private final JButton button;
    private final JTextField textField;

    public CustomFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        textField = new JTextField();
        button = new JButton("Submit");

        JTextField textField = new JTextField();
        textField.setFont(new Font("Consolas", Font.BOLD, 35));
        textField.setForeground(Color.red);
        textField.setBackground(Color.BLACK);
        textField.setPreferredSize(new Dimension(250, 40));

        button.addActionListener(listener -> {
            if (listener.getSource() == button) {
                System.out.println("Well done, " + textField.getText());
                textField.setEditable(false);
                button.setEnabled(false);
            }
        });

        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }
}
