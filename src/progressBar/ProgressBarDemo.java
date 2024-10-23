package progressBar;

import javax.swing.*;
import java.awt.*;

public class ProgressBarDemo {

    private final JFrame frame = new JFrame();
    private final JProgressBar progressBar = new JProgressBar();

    protected ProgressBarDemo() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());

        progressBar.setValue(0);
        progressBar.setPreferredSize(new Dimension(500, 50));
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font(Font.MONOSPACED, Font.BOLD, 15));
        progressBar.setBackground(Color.WHITE);
        progressBar.setForeground(Color.LIGHT_GRAY);
        frame.add(progressBar);

        frame.pack();
        frame.setVisible(true);

        fillBar();
    }

    private void fillBar() {
        int counter = 0;

        while (counter <= 100) {
            progressBar.setValue(counter);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter += 5;
        }
        progressBar.setString("NICE");
    }
}
