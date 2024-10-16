package openNewWindow;

import javax.swing.*;

public class MainWindow {
    private final JFrame frame = new JFrame();
    private final JButton button = new JButton("Open new window");

    public MainWindow() {
        button.setBounds(175, 175, 150, 50);
        button.setFocusable(false);
        button.addActionListener(listener -> {
            if (listener.getSource() == button) {
                //frame.dispose();
                new NewWindow();
            }
        });

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(button);
    }
}
