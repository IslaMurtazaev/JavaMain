package headFirst.gui;

import java.awt.*;
import javax.swing.*;

public class AnimationPractice {

    int x = 140;
    int y = 290;

    public static void main(String[] args) {

        AnimationPractice a = new AnimationPractice();
        a.createFrame();

    }

    private void createFrame(){

        JFrame frame = new JFrame();

        MyDrawPanel panel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.CENTER, panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        while (this.y > 0){
//            this.x++;
            this.y--;
            panel.repaint();
            try {
                Thread.sleep(10);
            } catch (Exception e){}
        }

    }

    class MyDrawPanel extends JPanel{
        public void paintComponent(Graphics g){
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y, 100, 100);
        }
    }

}
