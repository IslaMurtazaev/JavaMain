package derekBanasTut;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.text.NumberFormat;
import javax.swing.border.*;

public class Tutorial22 extends JFrame{

    JButton button;
    JLabel label1, label2, label3;
    JTextField textField1, textField2;
    JCheckBox dollarSign, commaSeparator;
    JRadioButton addNums, substractNums, multNums, divideNums;
    JSlider howManyTimes;

    double num1, num2, totalCalc;

    public static void main(String[] args) {

        new Tutorial22();

    }

    public Tutorial22(){
        this.setTitle("My third hundreds frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        button = new JButton("Calculate");
        button.addActionListener(new ButtonListener());
        panel.add(button);

        label1 = new JLabel("Number 1");
        panel.add(label1);
        textField1 = new JTextField(5);
        textField1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel.add(textField1);

        label2 = new JLabel("Number 2");
        panel.add(label2);
        textField2 = new JTextField(5);
        textField2.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        panel.add(textField2);

        dollarSign = new JCheckBox("Dollars");
        panel.add(dollarSign);
        commaSeparator = new JCheckBox("Commas", true);
        panel.add(commaSeparator);

        addNums = new JRadioButton("Add");
        substractNums = new JRadioButton("Substract");
        multNums = new JRadioButton("Multiply");
        divideNums = new JRadioButton("Divide");

        ButtonGroup operations = new ButtonGroup();
        operations.add(addNums);
        operations.add(substractNums);
        operations.add(multNums);
        operations.add(divideNums);

        JPanel operPanel = new JPanel();
        Border operBorder = BorderFactory.createTitledBorder("Operations");
        operPanel.setBorder(operBorder);
        operPanel.add(addNums);
        operPanel.add(substractNums);
        operPanel.add(multNums);
        operPanel.add(divideNums);

        label3 = new JLabel("How many times 1");
        howManyTimes = new JSlider(0, 99, 1);
        howManyTimes.setMinorTickSpacing(1);
        howManyTimes.setMajorTickSpacing(10);
        howManyTimes.setPaintTicks(true);
        howManyTimes.setPaintLabels(true);
//        panel.add(label3);
//        panel.add(howManyTimes);
        howManyTimes.addChangeListener(new SliderListener());

        JPanel bottom =  new JPanel();
        this.add(BorderLayout.SOUTH, bottom);
        bottom.add(label3);
        bottom.add(howManyTimes);

        this.add(BorderLayout.NORTH, panel);
        this.add(operPanel);
        this.setBounds(10, 10, 500, 400);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        textField1.requestFocus();
    }

    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent ev) {
            if (ev.getSource() == button){
                try {
                    num1 = Double.parseDouble(textField1.getText());
                    num2 = Double.parseDouble(textField2.getText());
                } catch (NumberFormatException ex){
                    JOptionPane.showMessageDialog(Tutorial22.this, "Please enter two numbers",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                } catch (Exception ex){
                    JOptionPane.showMessageDialog(Tutorial22.this, "Something went wrong(",
                            "Unknown error", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                if (addNums.isSelected()){ totalCalc = addNumbers(num1, num2, howManyTimes.getValue());}
                else if (substractNums.isSelected()){ totalCalc = substractNumbers(num1, num2, howManyTimes.getValue());}
                else if (multNums.isSelected()){ totalCalc = multNumbers(num1, num2, howManyTimes.getValue());}
                else if (divideNums.isSelected()){ totalCalc = divideNumbers(num1, num2, howManyTimes.getValue());}
                else {JOptionPane.showMessageDialog(Tutorial22.this, "Choose operation",
                            "Remark", JOptionPane.WARNING_MESSAGE);
                    return;}

                if (dollarSign.isSelected()){
                    NumberFormat numFormat = NumberFormat.getCurrencyInstance();
                    JOptionPane.showMessageDialog(Tutorial22.this, numFormat.format(totalCalc), "Solution", JOptionPane.PLAIN_MESSAGE);
                } else if (commaSeparator.isSelected()){
                    NumberFormat numberFormat = NumberFormat.getNumberInstance();
                    JOptionPane.showMessageDialog(Tutorial22.this, numberFormat.format(totalCalc), "Solution", JOptionPane.PLAIN_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(Tutorial22.this, totalCalc, "Solution", JOptionPane.PLAIN_MESSAGE);
                }
            }
        }
    }

    private static double addNumbers(double n1, double n2, double slider){
        for (int i = 0; i < slider; i++){
            n1 += n2;
        }
        return n1;
    }
    private static double substractNumbers(double n1, double n2, double slider){
        for (int i = 0; i < slider; i++){
            n1 -= n2;
        }
        return n1;
    }
    private static double multNumbers(double n1, double n2, double slider){
        for (int i = 0; i < slider; i++){
            n1 *= n2;
        }
        return n1;
    }
    private static double divideNumbers(double n1, double n2, double slider){
        for (int i = 0; i < slider; i++){
            n1 /= n2;
        }
        return n1;
    }

    class SliderListener implements ChangeListener{

        public void stateChanged(ChangeEvent ev) {
            label3.setText("How many times " + howManyTimes.getValue());
        }
    }

}
