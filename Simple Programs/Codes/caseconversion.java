import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class caseconversion extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField t1, t2;
    private JButton b1;

    public caseconversion() {
        setTitle("Title");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Text 1");
        l2 = new JLabel("Text 2");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("Convert");

        b1.addActionListener(this);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(new JLabel());
        add(b1);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String text1 = t1.getText();
            String text2 = t2.getText();
            System.out.println("text1: " + text1.toUpperCase());
            System.out.println("text2: " + text2.toUpperCase());
        }
    }

    public static void main(String args[]) {
        caseconversion c1 = new caseconversion();
        c1.setVisible(true);
    }
}
