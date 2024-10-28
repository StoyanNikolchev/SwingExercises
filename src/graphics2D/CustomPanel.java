package graphics2D;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {

    protected CustomPanel() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setPaint(Color.BLUE);
        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(0, 0, 500, 500);
        g2d.fillRect(160, 69, 50, 50);

        g2d.setPaint(Color.RED);
        g2d.drawArc(0, 0, 100, 100, 0, 360);

        g2d.fillArc(200, 200, 100, 100, 0, 180);
        g2d.setPaint(Color.LIGHT_GRAY);
        g2d.fillArc(200, 200, 100, 100, 180, 180);

        int[] xPoints = {150, 250, 350};
        int[] yPoints = {300, 150, 300};

        g2d.setPaint(Color.GREEN);
        g2d.drawPolygon(xPoints, yPoints, 3);

        g2d.setPaint(Color.ORANGE);
        g2d.setFont(new Font("Ink Free", Font.BOLD, 20));
        g2d.drawString("Yooo, wassup", 100, 183);
    }
}
