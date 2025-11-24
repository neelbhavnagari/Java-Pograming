// package Awt;

import java.awt.*;
import java.awt.event.*;

public class Radiobtn extends Frame implements ItemListener {
    CheckboxGroup cbg;
    Checkbox c1, c2, c3;
    TextField text1;

    Radiobtn() {
        setLayout(new FlowLayout());
        cbg = new CheckboxGroup();

        c1 = new Checkbox("1", false, cbg);
        add(c1);
        c1.addItemListener(this);

        c2 = new Checkbox("2", false, cbg);
        add(c2);
        c2.addItemListener(this);
        c3 = new Checkbox("3", false, cbg);
        add(c3);
        c2.addItemListener(this);

        text1 = new TextField(20);
        add(text1);

    }

    public void itemStateChanged(ItemEvent ie) {
        if (ie.getItemSelectable() == c1) {
            text1.setText("btn1");

        }
        if (ie.getItemSelectable() == c2) {
            text1.setText("btn2");
        }
        if (ie.getItemSelectable() == c3) {
            text1.setText("btn3");
        }

    }

    public static void main(String[] args) {
        Radiobtn rb = new Radiobtn();
        rb.setVisible(true);
        rb.setSize(300, 400);
    }

}
