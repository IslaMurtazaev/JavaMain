package headFirst.gui;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SimpleAnimation extends JPanel implements ActionListener{

    private static int y = 10;
    private static int ballSize = -50;
    JFrame frame;

    public static void main(String[] args) {

        SimpleAnimation circle = new SimpleAnimation();
        circle.createFrame();

    }

    public void createFrame(){

        frame = new JFrame();

        JButton button = new JButton("Do you want to see an animation?");
        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g){
        g.fillOval(180, y++, 100, 100);
        ballSize++;
        if (ballSize > 110){ballSize = 110;}
        g.fillOval(235-ballSize, 260, ballSize, ballSize);
        g.fillOval(235, 260, ballSize, ballSize);
    }

    public void actionPerformed(ActionEvent e){
        while (y < 250){
            this.repaint();
        }
    }

}
