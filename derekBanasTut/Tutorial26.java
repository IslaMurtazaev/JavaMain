package derekBanasTut;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.util.Date;
import javax.swing.SpinnerDateModel;
import java.util.Calendar;

public class Tutorial26 extends JFrame{
    JButton button;
    JSpinner spinner1, spinner2, spinner3, spinner4;
    String output = "";

    public static void main(String[] args) {
        new Tutorial26();
    }

    public Tutorial26(){
        JPanel panel = new JPanel();
        button = new JButton("Get info");
        button.addActionListener(new ButtonListener());

        spinner1 = new JSpinner();
        Dimension d = spinner1.getPreferredSize();
        d.width += 20;
        spinner1.setPreferredSize(d);

        spinner2 = new JSpinner(new SpinnerNumberModel(1, 0, 100, 1));

        String[] weekDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        spinner3 = new JSpinner(new SpinnerListModel(weekDays));

        Date todaysDate = new Date();
        spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4, "dd/MM/yyyy");
        spinner4.setEditor(dateEditor);

        panel.add(spinner1);
        panel.add(spinner2);
        panel.add(spinner3);
        panel.add(spinner4);
        panel.add(button);
        add(panel);
        setTitle("Finally, the last GUI tutorial in this series");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {

        }
    }

}
