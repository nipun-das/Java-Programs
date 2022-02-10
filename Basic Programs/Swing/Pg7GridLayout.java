package com.swing;

import javax.swing.*;
import java.awt.*;

public class Pg7GridLayout {
    JFrame jf;

    Pg7GridLayout() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(btn4);
        jf.add(btn5);
        jf.add(btn6);
        jf.add(btn7);
        jf.add(btn8);
        jf.add(btn9);
        jf.setLayout(new GridLayout(3, 3, 5, 5));
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg7GridLayout();
            }
        });
    }
}