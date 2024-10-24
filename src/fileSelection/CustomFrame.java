package fileSelection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class CustomFrame extends JFrame implements ActionListener {
    private final JButton button;

    protected CustomFrame() {
        button = new JButton("Select File");
        button.addActionListener(this);

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("File Chooser");
        this.setLayout(new FlowLayout());

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("/home/immedicable/Downloads"));
            int response = chooser.showOpenDialog(null);

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(chooser.getSelectedFile().getAbsolutePath());
                System.out.println(file.getAbsolutePath());
            }
        }
    }
}
