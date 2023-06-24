import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class UserVerificationGUI extends JFrame implements ActionListener {
    private JLabel username, password;
    private JTextField usernameTextField, passwordTextField;
    private JButton submit;

    public UserVerificationGUI() {
        setTitle("User Verification");
        setSize(300, 200);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        username = new JLabel("User Name");
        password = new JLabel("Password");
        usernameTextField = new JTextField();
        passwordTextField = new JTextField();
        submit = new JButton("Verify");
        submit.addActionListener(this);


        add(username);
        add(usernameTextField);
        add(password);
        add(passwordTextField);
        add(new JLabel());
        add(submit);

        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String usrname = usernameTextField.getText();
            String pass = usernameTextField.getText();
            if (usrname.equals("Admin") && pass.equals("Admin")) {
                JOptionPane.showMessageDialog(null, "Login Successful");
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed Try Again!");
                usernameTextField.setText("");
                passwordTextField.setText("");
            }
        }
    }

    public static void main(String[] args) {
        UserVerificationGUI us1 = new UserVerificationGUI();
        us1.setVisible(true);
    }

}