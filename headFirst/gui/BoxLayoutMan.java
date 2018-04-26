package headFirst.gui;

import javax.swing.*;
import java.awt.*;

public class BoxLayoutMan extends JFrame{

    public static void main(String[] args) {
        BoxLayoutMan frame = new BoxLayoutMan();
        frame.go();
        // It's also possible to shut down the LManager setLayout(null) and hardcode everything yourself
    }

    private void go(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // FlowLayoutMan is a default LayoutManager for panels
        panel.setBackground(Color.CYAN);
        add(BorderLayout.EAST, panel); // while the panel is empty it takes a small width

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // CHANGE its default L manager

        JButton button = new JButton("I expand the panel");
        panel.add(button); // BTW the button gets its preferred dimensions, thanks to FL manager

        JButton button1 = new JButton("I should be on the next line");
        panel.add(button1);

        setSize(300, 300);
        setVisible(true);
    }

}