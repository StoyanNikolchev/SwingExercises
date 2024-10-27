package dragAndDrop;

import javax.swing.*;

public class CustomFrame extends JFrame {

    private final DragPanel panel;

    protected CustomFrame() {
        this.setTitle("Drag and Drop");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        panel = new DragPanel();
        panel.setBounds(0, 0, this.getWidth(), this.getHeight());

        this.add(panel);
        this.setVisible(true);
    }
}
