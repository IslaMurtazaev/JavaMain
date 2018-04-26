package headFirst.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutMan extends JFrame{

    public static void main(String[] args) {
        FlowLayoutMan frame = new FlowLayoutMan();
        frame.go();
    }

    private void go(){

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(); // FlowLayoutMan is a default LayoutManager for panels
        panel.setBackground(Color.CYAN);
        add(BorderLayout.EAST, panel); // while the panel is empty it takes a small width

        // if we want to make our panel larger
//        panel.add(new JColorChooser(Color.black)); // add smth to a panel

        JButton button = new JButton("I expand the panel");
        panel.add(button); // BTW the button gets its preferred dimensions, thanks to FL manager

        panel.setBounds(0, 0, 70, this.getHeight());
        JButton button1 = new JButton("I can't be on the next line");
        panel.add(button1);

        setSize(300, 300);
        setVisible(true);
    }

}
