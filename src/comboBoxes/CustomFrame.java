package comboBoxes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomFrame extends JFrame implements ActionListener {

    protected CustomFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Combo Boxes");

        String[] animals = {"Dog", "Cat", "Bird", "Pesho Baftata"};
        JComboBox<String> comboBox = new JComboBox<>(animals);
        comboBox.addActionListener(this);
        comboBox.setSelectedIndex(-1);

        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JComboBox comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
