package radioButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomFrame extends JFrame implements ActionListener {
    private final JRadioButton vodkaButton;
    private final JRadioButton warmMilkButton;
    private final JRadioButton whiskyButton;
    private final JRadioButton beerButton;

    protected CustomFrame() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Bar Crazy2");
        this.setLayout(new FlowLayout());

        vodkaButton = new JRadioButton("Vodka");
        warmMilkButton = new JRadioButton("Warm Milk");
        whiskyButton = new JRadioButton("Whisky");
        beerButton = new JRadioButton("Beer");

        ButtonGroup group = new ButtonGroup();
        group.add(vodkaButton);
        group.add(warmMilkButton);
        group.add(whiskyButton);
        group.add(beerButton);

        vodkaButton.addActionListener(this);
        warmMilkButton.addActionListener(this);
        whiskyButton.addActionListener(this);
        beerButton.addActionListener(this);

        this.add(vodkaButton);
        this.add(warmMilkButton);
        this.add(whiskyButton);
        this.add(beerButton);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JRadioButton button) {
            System.out.println("You ordered " + button.getText());
        }
    }
}
