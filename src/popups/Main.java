package popups;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Have some information.", "Popup!", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Yes. No. Maybe. I don't know. CAN YOU REPEAT THE QUESTION!?", "Popup!", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "An error message.", "Popup!", JOptionPane.ERROR_MESSAGE);

        //0 for yes, 1 for no, -1 for clicking X
        int answer = JOptionPane.showConfirmDialog(null, "Anyone there?", "Question time.", JOptionPane.YES_NO_OPTION);
        System.out.println(answer);

        String name = JOptionPane.showInputDialog("Enter your name.");
        System.out.println(name);

        String[] responses = {"It is!", "Nah.", "Yawn"};
        ImageIcon icon = new ImageIcon("src/icon.png");

        JOptionPane.showOptionDialog(null,
                "What a great day.",
                "The Title",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE,
                icon,
                responses,
                0);
    }
}