import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class quit extends JFrame implements ActionListener {
    private JButton b1, b2;

    public quit() {
        setTitle("Exitter");
        setSize(200,200);
        setLayout(new FlowLayout());    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1  = new JButton("Close");
        add(b1);
        b1.addActionListener(this);
        b2  = new JButton("Click");
        add(b2);
        b2.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource()==b1){
            System.exit(1);
        }
         if (e.getSource()==b2){
            JOptionPane.showMessageDialog(this,"Click on Close Habibi~");
        }
    }

    public static void main(String args[]){
        quit q = new quit();
        q.setVisible(true);
    }

}
