package derekBanasTut;

import java.awt.*;
import javax.swing.*;

public class Tutorial20 extends JFrame{

    public static void main(String[] args) {

        Tutorial20 gui = new Tutorial20();

    }

    public Tutorial20(){

        this.setSize(400, 400);

        // this.setLocationRelativeTo(null);
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        // setting location to the center
        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height / 2) - (this.getHeight() / 2);
        this.setLocation(xPos, yPos);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My hundreds frame");

        JPanel panel = new JPanel();
        this.add(panel);

        JLabel label = new JLabel("This is a label");
        label.setText("New text");
        label.setToolTipText("Doesn't do anything");
        panel.add(label);

        JButton button = new JButton("Send");
//        button.setBorderPainted(false);
//        button.setContentAreaFilled(false);
        button.setText("New button");
        button.setToolTipText("This is a button");
        panel.add(button);

        JTextField textField = new JTextField("Text Field at your service!", 15);
        textField.setColumns(20);
        panel.add(textField);

        JTextArea textArea = new JTextArea(20, 20);
        textArea.setText("Some random but long text, blablabla IShouldBeOnTheSecondLine\n fsdjkl;aaaaa;fsjkdlaf;sdklfsjdk");
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        int numOfLines = textArea.getLineCount(); // WHY IS IT ONE?
        textArea.append(" number of lines somehow is "+numOfLines);
        System.out.println(numOfLines);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        panel.add(scrollPane);

        this.setResizable(false);
//        this.setAlwaysOnTop(true);

        this.setVisible(true);

        textField.requestFocus();

    }

}
