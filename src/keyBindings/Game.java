package keyBindings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {

    private JFrame frame;
    private JLabel label;

    private Action upAction;
    private Action downAction;
    private Action rightAction;
    private Action leftAction;

    protected Game() {
        frame = new JFrame("Epic Title");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);

        label = new JLabel();
        label.setBackground(Color.BLUE);
        label.setBounds(100, 100, 100, 100);
        label.setOpaque(true);

        upAction = new UpAction();
        downAction = new DownAction();
        rightAction = new RightAction();
        leftAction = new LeftAction();

        label.getInputMap().put(KeyStroke.getKeyStroke("UP"), "upAction");
        label.getActionMap().put("upAction", upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"), "downAction");
        label.getActionMap().put("downAction", downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
        label.getActionMap().put("leftAction", leftAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
        label.getActionMap().put("rightAction", rightAction);

        frame.add(label);
        frame.setVisible(true);
    }

    private class UpAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
             label.setLocation(label.getX(), label.getY() - 10);
        }
    }

    private class DownAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(), label.getY() + 10);
        }
    }

    private class RightAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() + 10, label.getY());
        }
    }

    private class LeftAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX() - 10, label.getY());

        }
    }
}
