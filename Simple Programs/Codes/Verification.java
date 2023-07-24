import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Verification extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField p1, p2;
    private JButton b1;

    public Verification() {
        setTitle("Verification");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Name");
        p1 = new JTextField();
        l2 = new JLabel("Password");
        p2 = new JTextField();
        b1 = new JButton("Login");
        b1.addActionListener(this);
        setVisible(true);

        add(l1);
        add(p1);
        add(l2);
        add(p2);
        add(new JLabel());
        add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            String Username = p1.getText();
            String Password = p2.getText();
            if (Username.equals("Admin") && (Password.equals("Admin"))) {
                JOptionPane.showMessageDialog(this, "Login Successfull");
            } else {
                JOptionPane.showMessageDialog(this, "Login in failed Try Again!");
                p1.setText("");
                p2.setText("");
            }
        }
    }

    public static void main (String args[]){
        Verification v1 = new Verification();
        v1.setVisible(true);
    }

}
