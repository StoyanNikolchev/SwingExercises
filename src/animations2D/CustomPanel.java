package animations2D;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomPanel extends JPanel implements ActionListener {

    private final int WIDTH = 500;
    private final int HEIGHT = 500;
    private Image image;
    private Timer timer;
    private int xVelocity = 6;
    private int yVelocity = 3;
    private int x = 0;
    private int y = 0;

    protected CustomPanel() {
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLUE);

        image = new ImageIcon("src/icon.png").getImage();
        timer = new Timer(15, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g); //paints the background

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, x, y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= WIDTH - image.getWidth(null) || x < 0) {
            xVelocity = xVelocity * -1;
        }
        x = x + xVelocity;

        if (y >= HEIGHT - image.getHeight(null) || y < 0) {
            yVelocity = yVelocity * -1;
        }
        y = y + yVelocity;
        repaint();
    }
}
