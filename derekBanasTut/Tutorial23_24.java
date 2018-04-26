package derekBanasTut;

import java.awt.event.*;
import javax.swing.*;

public class Tutorial23_24 extends JFrame{
    JComboBox favoriteShows;
    JButton button;
    String infoOnComponent = "";

    public static void main(String[] args) {
        new Tutorial23_24();
    }

    public Tutorial23_24(){

        setTitle("My 400th frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        String[] shows = {"Breaking News", "Kai Gul TV", "Life on Mars", "Game of Thrones"};

        favoriteShows = new JComboBox(shows);
        favoriteShows.addItem("Futurama");
        favoriteShows.setMaximumRowCount(3);
        favoriteShows.insertItemAt("Gravity Falls", 1);
        favoriteShows.removeItemAt(1);
        panel.add(favoriteShows);

        button = new JButton("Get info");
        button.addActionListener(new ButtonListener());
        panel.add(button);

        add(panel);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource() == button){
                favoriteShows.setEditable(true);

                if (favoriteShows.getSelectedIndex() == -1){
                    JOptionPane.showMessageDialog(Tutorial23_24.this, "Unfortunately, we don't have this show",
                            "Remark", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                infoOnComponent += "Item at index 0 " + favoriteShows.getItemAt(0)+"\n";
                infoOnComponent += "Number of items " + favoriteShows.getItemCount()+"\n";
                infoOnComponent += "Selected index " + favoriteShows.getSelectedIndex()+"\n";
                infoOnComponent += "Selected value " + favoriteShows.getSelectedItem()+"\n";
                infoOnComponent += "Are editable " + favoriteShows.isEditable();
                JOptionPane.showMessageDialog(Tutorial23_24.this, infoOnComponent);
                infoOnComponent = "";
            }
        }
    }

}
