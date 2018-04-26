package headFirst.gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SeveralObjects{

    JPanel panel;
    JFrame frame;
    JLabel label;
    JButton button;

    public static void main(String[] args){

        SeveralObjects circle = new SeveralObjects();
        circle.go();

    }

    public void go(){
        frame = new JFrame();

        RandColoredCircle panel = new RandColoredCircle();
        button = new JButton("Change planet");
        button.addActionListener(new PlanetListener());

        label = new JLabel("New discovered planet");
        JButton button2 = new JButton("Conquer");
        button2.addActionListener(new LabelListener());

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST, button2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1360, 1000);
        frame.setVisible(true);

    }

    class LabelListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            label.setText("The planet is under your control Supreme Leader");
        }
    }

    class PlanetListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            if (ev.getSource() == button){
                frame.repaint();
                label.setText("New discovered planet");
            }
        }
    }

}
