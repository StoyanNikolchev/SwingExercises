package keyListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CustomFrame extends JFrame implements KeyListener {

    private final JLabel label;

    protected CustomFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500, 500);
        this.setLayout(null);
        this.addKeyListener(this);

        label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.BLUE);
        label.setOpaque(true);

        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

        switch(e.getKeyChar()) {
            case 'a':
                label.setLocation(label.getX() - 5, label.getY());
                break;

            case 's':
                label.setLocation(label.getX(), label.getY() + 5);
                break;

            case 'd':
                label.setLocation(label.getX() + 5, label.getY());
                break;

            case 'w':
                label.setLocation(label.getX(), label.getY() - 5);
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key number: " + e.getKeyCode());
    }
}
