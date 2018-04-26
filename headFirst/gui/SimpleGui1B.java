package headFirst.gui;

import javax.swing.*;
import java.awt.event.*; // ActionListener & ActionEvent are in

public class SimpleGui1B implements ActionListener {

    JButton button;

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();

    }

    public void go(){
        JFrame frame = new JFrame();
        button = new JButton("Click me to get number of blowing stars the Universe at the moment");

        button.addActionListener(this);

        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ev){
//        button.setText("I've been clicked)");
        button.setText(String.valueOf((int)(Math.random()*11)));
    }

}
