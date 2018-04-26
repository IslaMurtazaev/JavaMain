package derekBanasTut;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Tutorial21 extends JFrame {

    JButton button;
    JTextField textField;
    JTextArea textArea;
    int buttonClicked;

    public static void main(String[] args) {

        new Tutorial21();

    }

    public Tutorial21(){

        this.setSize(400, 400);

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension dim = tk.getScreenSize();

        int xPos = (dim.width / 2) - (this.getWidth() / 2);
        int yPos = (dim.height /2) - (this.getHeight() /2 );
        this.setLocation(xPos, yPos);

        this.setTitle("My hundred first simple window");

        button = new JButton("Click here");

        ButtonListener bl = new ButtonListener();
        button.addActionListener(bl);

        textArea = new JTextArea("Tracking events\n",15, 30);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(textArea);
        panel.add(scrollPane);


        textField = new JTextField(20);
        ListenForKeys keyListener = new ListenForKeys();
        textField.addKeyListener(keyListener);
        panel.add(textField);


        ListenForWindow windListener = new ListenForWindow();
        this.addWindowListener(windListener);


        ListenForMouse mouseListener = new ListenForMouse();
        panel.addMouseListener(mouseListener);


        this.add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    class ButtonListener implements ActionListener{

        public void actionPerformed(ActionEvent ev){
            if (ev.getSource() == button){

                buttonClicked++;

                textArea.setText("Button's been clicked "+buttonClicked+" times");

            }
        }

    }

    class ListenForKeys implements KeyListener {

        @Override
        public void keyPressed(KeyEvent e) {
            textArea.append(e.getKeyChar()+"");
        }

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    class ListenForWindow implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            textArea.append("Window created\n");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            textArea.append("Window is closing\n");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            textArea.append("Window is closed\n");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            textArea.append("Window iconified\n");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            textArea.append("Window deiconified\n");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            textArea.append("Window activated\n");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            textArea.append("Window deactivated\n");
        }
    }

    class ListenForMouse implements MouseListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            textArea.append(String.format("Mouse clicked at %dx and %dy position\n", e.getX(), e.getY()));
            textArea.append(String.format("Mouse clicked at %dx and %dy position on screen\n", e.getXOnScreen(), e.getYOnScreen()));
            textArea.append(e.getButton()+" has been clicked");
            textArea.append(e.getClickCount()+" times been clicked");
//            textArea.append(e.getLocationOnScreen()+" location");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            textArea.append("Mouse pressed\n");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            textArea.append("Mouse released\n");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            textArea.append("Mouse entered\n");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            textArea.append("Mouse exited\n");
        }
    }
}
