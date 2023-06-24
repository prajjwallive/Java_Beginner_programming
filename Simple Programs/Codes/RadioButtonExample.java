import javax.swing.*;

public class RadioButtonExample extends JFrame {

    public RadioButtonExample() {
        setTitle("Iradio Button");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JRadioButton r1 = new JRadioButton("Radio 1");
        JRadioButton r2 = new JRadioButton("Radio 2");
        JRadioButton r3 = new JRadioButton("Radio 3");
        
        ButtonGroup grp  = new ButtonGroup();
        grp.add(r1);
        grp.add(r2);
        grp.add(r3);

        panel.add(r1);
        panel.add(r2);
        panel.add(r3);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        RadioButtonExample r1 = new RadioButtonExample();
        r1.setVisible(true);
    }

}