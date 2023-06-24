import java.awt.*;

import java.awt.event.*;

class regform extends Frame {
    // constructor for regform class
    regform() {
        setLayout(null); // Flow layout
        // Code for creating GUI
        Label l1 = new Label("Registration Form");
        add(l1);
        l1.setBounds(350, 50, 100, 50);

        Label l2 = new Label("First Name");
        add(l2);
        l2.setBounds(200, 100, 70, 50);

        TextField t1 = new TextField(15);
        add(t1);
        t1.setBounds(250, 115, 100, 20);

        Label l3 = new Label("Last Name");
        add(l3);
        l3.setBounds(400, 100, 70, 50);

        TextField t2 = new TextField(15);
        add(t2);
        t2.setBounds(450, 115, 100, 20);

        Label l4 = new Label("Address");
        add(l4);
        l4.setBounds(200, 140, 70, 50);

        TextField a = new TextField(50);
        add(a);
        a.setBounds(250, 160, 250, 20);

        Label l6 = new Label("Gender");
        add(l6);
        l6.setBounds(200, 210, 70, 20);

        CheckboxGroup cbg = new CheckboxGroup();

        Checkbox cm = new Checkbox("Male", cbg, false);
        add(cm);
        cm.setBounds(270, 210, 70, 20);

        Checkbox cf = new Checkbox("Female", cbg, false);
        add(cf);
        cf.setBounds(340, 210, 70, 20);

        Label l5 = new Label("Hobbies");
        add(l5);
        l5.setBounds(200, 270, 70, 20);

        Checkbox c1 = new Checkbox("Cricket");
        add(c1);
        c1.setBounds(270, 270, 70, 20);

        Checkbox c2 = new Checkbox("Reading");
        add(c2);
        c2.setBounds(340, 270, 70, 20);

        Checkbox c3 = new Checkbox("Football");
        add(c3);
        c3.setBounds(410, 270, 70, 20);

        Label l7 = new Label("Subjects");
        add(l7);
        l7.setBounds(200, 320, 70, 20);

        List l = new List(4);
        l.add("C++");
        l.add("C");
        l.add("PHP");
        l.add("Java");
        add(l);
        l.setBounds(270, 320, 100, 70);

        Label l8 = new Label("City");
        add(l8);
        l8.setBounds(200, 420, 40, 20);

        Choice c = new Choice();
        c.add("KTM");
        c.add("CTWN");
        c.add("PKR");
        add(c);
        c.setBounds(270, 420, 100, 50);

        Button b1 = new Button("Send Data");
        add(b1);
        b1.setBounds(350, 470, 100, 50);

        // Closing the frame
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        // Control Frame
        setVisible(true);
        setSize(800, 800);
        setTitle("Registration Form");

        setResizable(false);
    }

    public static void main(String[] args) {

        regform r = new regform();
    }
}