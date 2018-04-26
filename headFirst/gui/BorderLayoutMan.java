package headFirst.gui;

import java.awt.*;
import javax.swing.*;

public class BorderLayoutMan extends JFrame{

    public static void main(String[] args) {
        BorderLayoutMan frame = new BorderLayoutMan();
        frame.go();
    }

    private void go(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonNorth = new JButton("I am as high as I want, but as wide as a frame");
        buttonNorth.setFont(new Font("serif", Font.BOLD, 30));
        JButton buttonEast = new JButton("the same but versa, I can't choose my height(");


        getContentPane().add(BorderLayout.NORTH, buttonNorth);
        getContentPane().add(BorderLayout.EAST, buttonEast);
        getContentPane().add(BorderLayout.WEST, new Button("Hi from West"));
        getContentPane().add(BorderLayout.CENTER, new Button("Don't complain! I get only what is left from you"));
        getContentPane().add(BorderLayout.SOUTH, new JCheckBox("Click it if you are from south"));

//        pack();
        setSize(500, 500);
        setVisible(true);

    }

}
