package mouseListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomFrame extends JFrame implements MouseListener {

    private final JLabel label;

    protected CustomFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.RED);
        label.setOpaque(true);

        label.addMouseListener(this);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Hey, you clicked your mouse!!!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse!");
        label.setBackground(Color.GRAY);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("The mouse has been released!");
        label.setBackground(Color.RED);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the label");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the label");
    }
}
