package derekBanasTut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Tutorial25 extends JFrame{
    JButton button;
    String infoOnComponent = "";
    JList favoriteMovies, favoriteColors;
    DefaultListModel defListModel = new DefaultListModel(); // makes list items editable
    JScrollPane scrollPane;

    public static void main(String[] args) {
        new Tutorial25();
    }

    public Tutorial25(){

        JPanel thePanel = new JPanel();
        button = new JButton("Get answer");
        button.addActionListener(new ButtonListener());

        String[] movies = {"Forest Gump", "Good Will Hunting", "Monty Python", "The last Samurai"};
        favoriteMovies = new JList(movies);
        favoriteMovies.setFixedCellHeight(30);
        favoriteMovies.setFixedCellWidth(150);
        favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        String[] colors = {"Red", "Green", "Blue", "Purple", "Black", "Brown", "Aqua"};
        for(String color : colors){
            defListModel.addElement(color);
        }
        defListModel.add(5, "Torqoise");
        favoriteColors = new JList(defListModel);
        favoriteColors.setVisibleRowCount(4);
        favoriteColors.setFixedCellHeight(30);
        favoriteColors.setFixedCellWidth(150);
        scrollPane = new JScrollPane(favoriteColors, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        thePanel.add(scrollPane);
        thePanel.add(favoriteMovies);
        thePanel.add(button);
        add(thePanel);
        setTitle("My five hundreds frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource() == button){
                if (defListModel.contains("Black")) infoOnComponent += "Im not a racist guys\n";
                if (defListModel.isEmpty()) infoOnComponent += "There is noone\n";
                else {
                    infoOnComponent += "There are " + defListModel.size() + " amigos\n";
                    infoOnComponent += "This guy "+ defListModel.firstElement() +" is the first one\n";
                    infoOnComponent += "And here comes "+ defListModel.lastElement() +" the last\n";

                    infoOnComponent += "Full list:\n";
                    Object[] arrayOfColors = defListModel.toArray();
                    for (Object color : arrayOfColors){
                        infoOnComponent += color+"\n";
                    }
                }
                JOptionPane.showMessageDialog(Tutorial25.this, infoOnComponent);
                infoOnComponent = "";
            }
        }
    }

}
