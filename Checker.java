

import java.awt.*;
import java.awt.event.*;

public class Checker extends Frame implements ItemListener {

    Checkbox c1, c2, c3;
    TextField text1;

    Checker() {
        setLayout(new FlowLayout());

        c1 = new Checkbox("Red");
        add(c1);
        c1.addItemListener(this);

        c2 = new Checkbox("Yellow");
        add(c2);
        c2.addItemListener(this);

        c3 = new Checkbox("Pink");
        add(c3);
        c3.addItemListener(this);

        text1 = new TextField(20);
        add(text1);

        setSize(300, 300);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getItemSelectable() == c1) {
            text1.setText("Red");
        }
        else if (ie.getItemSelectable() == c2) {
            text1.setText("Yellow");
        }
        else if (ie.getItemSelectable() == c3) {
            text1.setText("Pink");
        }
    }

    public static void main(String[] args) {
        new Checker();
    }
}
