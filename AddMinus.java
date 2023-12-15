import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

public class AddMinus extends JFrame implements ActionListener {
    JButton btnAdd, btnSubtract;
    JTextField t1, t2, t3;

    public AddMinus() {
        setSize(500, 600);
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        btnAdd = new JButton("+");
        btnSubtract = new JButton("-");

        add(t1);
        add(t2);
        add(t3);
        add(btnAdd);
        add(btnSubtract);

        t1.setColumns(10);
        t2.setColumns(10);
        t3.setColumns(10);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            performAddition();
        } else if (e.getSource() == btnSubtract) {
            performSubtraction();
        }
    }

    private void performAddition() {
        // try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int sum = n1 + n2;
            t3.setText(String.valueOf(sum));
        // } catch (NumberFormatException ex) {
        //     JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        // }
    }

    private void performSubtraction() {
        // try {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            int difference = n1 - n2;
            t3.setText(String.valueOf(difference));
        // } catch (NumberFormatException ex) {
        //     JOptionPane.showMessageDialog(this, "Invalid input. Please enter valid numbers.");
        // }
    }

    public static void main(String[] args) {
        new AddMinus();
    }
}
