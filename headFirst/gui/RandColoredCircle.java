package headFirst.gui;

import java.awt.*;
import javax.swing.*;

public class RandColoredCircle extends JPanel{

    public static void main(String[] args) {

        RandColoredCircle circle = new RandColoredCircle();
        circle.createFrame();

    }

    public void createFrame(){
        JFrame frame = new JFrame();

        RandColoredCircle circle = new RandColoredCircle();
        frame.getContentPane().add(circle);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g){
        Color background = Color.DARK_GRAY;
        g.setColor(background);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
//        Color randColor = new Color();

//        g.setColor(randColor);
        Color startColor = new Color(red, green, blue);

        red = (int)(Math.random() * 255);
        green = (int)(Math.random() * 255);
        blue = (int)(Math.random() * 255);
//        randColor = new Color(red, green, blue);
        Color endColor = new Color(red, green, blue);



        Graphics2D g2d = (Graphics2D) g;
        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);

        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
        g2d.rotate(0, 0, 70);

    }

}
