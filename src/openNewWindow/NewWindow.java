package openNewWindow;

import javax.swing.*;

public class NewWindow {
    private final JFrame frame = new JFrame("New window");
    public NewWindow() {
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
