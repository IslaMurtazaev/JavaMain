package headFirst.gui;

//import java.awt.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JComponents{

    JCheckBox checkBox;
    JTextArea textArea;
    JList list;

    public static void main(String[] args) {

        JComponents components = new JComponents();
        components.go();

    }

    public void go(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

//        JTextField field = new JTextField(10);
//        JLabel label = new JLabel("Type your dog's name:");
//        field.requestFocus();
//        panel.add(label);
//        panel.add(field);


//        textArea = new JTextArea("Imma HIGHLIGHTED",20, 20);
//        JScrollPane scroller = new JScrollPane(textArea);
//        textArea.setLineWrap(true);
//        textArea.setWrapStyleWord(true);
//        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//
//        textArea.selectAll();
//        textArea.requestFocus();
//
//        panel.add(scroller);
//        frame.add(BorderLayout.CENTER, panel);
//
//        checkBox = new JCheckBox("I'm a junior programmer");
//        checkBox.addItemListener(new ItemStateListener());
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
//        frame.add(BorderLayout.SOUTH, checkBox);

        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);
        list.setFont(new Font(Font.SANS_SERIF, Font.ITALIC, 14));
//        list.setVisibleRowCount(3);
//        list.setSelectedIndex(0);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(scrollPane);
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    class ItemStateListener implements ItemListener{

        public void itemStateChanged(ItemEvent ev){
            if (checkBox.isSelected()) {
                textArea.setText("Cool!");
            } else {
                textArea.setText("Not cool..");
            }
        }
    }

}
