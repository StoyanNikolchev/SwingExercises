package sliders;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SliderDemo implements ChangeListener {

    private final JFrame frame;
    private final JPanel panel;
    private final JLabel label;
    private final JSlider slider;

    protected SliderDemo() {
        frame = new JFrame("Sliders Demo");
        panel = new JPanel();
        label = new JLabel();
        slider = new JSlider(0, 100, 50);

        slider.setPreferredSize(new Dimension(150, 350));
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("Value = " + slider.getValue());
        label.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

        slider.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(slider);
        panel.add(label);

        panel.setAlignmentY(Component.CENTER_ALIGNMENT);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() == slider) {
            label.setText("Value = " + slider.getValue());
        }
    }
}
