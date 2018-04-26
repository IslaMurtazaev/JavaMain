package headFirst.gui;

import javax.swing.*;
import java.awt.*;

public class ImageJPEG extends JPanel{

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageJPEG panda = new ImageJPEG();
        frame.getContentPane().add(panda);
        // Using only one line
//        frame.getContentPane().add(new JLabel(new ImageIcon("C:/Users/Admin/Pictures/Screenshots/Screenshot (46).png")));
        frame.setSize(1380, 1000);
        frame.setVisible(true);

    }

    public void paintComponent(Graphics g){
        Image image = new ImageIcon("C:/Users/Admin/Pictures/Screenshots/Screenshot (46).png").getImage();
        g.drawImage(image, 3, 4, this);

    }

}
