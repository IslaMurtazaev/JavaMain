package derekBanasTut;

import java.awt.event.*;
import javax.swing.*;
import java.awt.Dimension;
import java.util.Enumeration;
import javax.swing.tree.*;

public class Tutorial27 extends JFrame{
    JButton button;
    String output = "";
    JTree tree;
    DefaultMutableTreeNode documents, work, games, email;
    DefaultMutableTreeNode fileSystem = new DefaultMutableTreeNode("C Drive");

    public static void main(String[] args) {
        new Tutorial27();
    }

    public Tutorial27(){

        button = new JButton("Get info");
        button.addActionListener(new ButtonListener());

        tree = new JTree(fileSystem);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        tree.setVisibleRowCount(8);

        documents = addFile("Docs", fileSystem);
        email = addFile("Emails", documents);
        work = addFile("Work", email);
        addFile("IT-attractor", work);
        addFile("Schedule.txt", email);
        addFile("Taxes.exl", documents);
        addFile("Story.txt", documents);

        JScrollPane scrollPane = new JScrollPane(tree);
        Dimension d = scrollPane .getPreferredSize();
        d.width = 200;
        scrollPane.setPreferredSize(d);

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(button);

        add(panel);
        setTitle("I hope that it's the last one");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private DefaultMutableTreeNode addFile(String fileName, DefaultMutableTreeNode parentNode){
        DefaultMutableTreeNode newFile = new DefaultMutableTreeNode(fileName);
        parentNode.add(newFile);
        return newFile;
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev){

            if (ev.getSource() == button){

                Object treeObject = tree.getLastSelectedPathComponent();
                DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) treeObject;
                String node = (String) treeNode.getUserObject();

                output += "The selected Node: "+ treeNode +"\n";
                output += "Number of children: "+ treeNode.getChildCount() +"\n";
                output += "Number of siblings: "+ treeNode.getSiblingCount() +"\n";
                output += "Parent "+ treeNode.getParent() +"\n";
                output += "Next node "+ treeNode.getNextNode() +"\n";
                output += "Previous node "+ treeNode.getPreviousNode() +"\n";

                output += "\nAll children of Node\n";
                for (Enumeration enumValue = treeNode.children(); enumValue.hasMoreElements();){
                    output += enumValue.nextElement() +"\n";
                }

                output += "\nPath from Root\n";
                TreeNode[] path = treeNode.getPath();
                for (TreeNode indivNode : path){
                    output += "/"+ indivNode;
                }

                JOptionPane.showMessageDialog(Tutorial27.this, output);
                output = "";

            }

        }
    }


}
