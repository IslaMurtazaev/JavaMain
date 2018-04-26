package headFirst.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraticeGUI1 implements ActionListener {
    JButton button;

    private static String[] badWords = new String[]{"Bitch!", "Nigga!", "Bastard!", "Cunt!", "PussyBoy!"};

    public static void main(String[] args) {
        PraticeGUI1 test1 = new PraticeGUI1();
        test1.createFrame();
    }

    public void createFrame(){

        JFrame frame = new JFrame();

        button = new JButton("Click me to find out who you are)");
        frame.getContentPane().add(button);

        button.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 360);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void actionPerformed(ActionEvent ev){
        if (!button.getText().equals("Click me to find out who you are)")){
            button.setText("Click me to find out who you are)");
        } else {
            button.setText(badWords[(int)(Math.random()*badWords.length)]);
        }
    }

}
