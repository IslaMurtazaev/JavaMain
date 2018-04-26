package headFirst.gui;

import javax.swing.*;

public class SimpleGUI {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Hey! Yes you, click me NOW!!!");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(button);

        frame.setSize(400, 300);
        frame.setVisible(true);

    }

}
