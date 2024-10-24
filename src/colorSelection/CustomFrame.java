package colorSelection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomFrame extends JFrame implements ActionListener {
    private final JButton button;

    protected CustomFrame() {
        button = new JButton("Select Color");
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Color Chooser");
        this.setLayout(new FlowLayout());

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color", Color.BLACK);
            button.setForeground(color);
        }
    }
}
