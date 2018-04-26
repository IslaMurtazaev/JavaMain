package headFirst.gui;

import java.awt.*;
import javax.swing.*;

public class MyDrawPanel extends JPanel{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        MyDrawPanel p = new MyDrawPanel();
        frame.getContentPane().add(p);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(50, 50, 200, 200);
    }

}
