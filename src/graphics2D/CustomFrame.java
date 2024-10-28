package graphics2D;

import javax.swing.*;

public class CustomFrame extends JFrame {
    private final CustomPanel panel;

    protected CustomFrame() {
        panel = new CustomPanel();
        this.add(panel);
        this.pack();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
