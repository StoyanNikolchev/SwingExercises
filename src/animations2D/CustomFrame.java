package animations2D;

import javax.swing.*;

public class CustomFrame extends JFrame {

    private CustomPanel panel;

    protected CustomFrame() {
        panel = new CustomPanel();

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setVisible(true);
    }
}
