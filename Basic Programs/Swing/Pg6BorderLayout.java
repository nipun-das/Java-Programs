package com.swing;

import javax.swing.*;
import java.awt.*;

public class Pg6BorderLayout {
JFrame jf;
Pg6BorderLayout(){
    jf = new JFrame();
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton btn1 = new JButton("NORTH");
    JButton btn2 = new JButton("SOUTH");
    JButton btn3 = new JButton("EAST");
    JButton btn4 = new JButton("WEST");
    JButton btn5 = new JButton("CENTER");
    jf.add(btn1, BorderLayout.NORTH);
    jf.add(btn2, BorderLayout.SOUTH);
    jf.add(btn3, BorderLayout.EAST);
    jf.add(btn4, BorderLayout.WEST);
    jf.add(btn5, BorderLayout.CENTER);
    jf.setSize(400,400);
    jf.setVisible(true);


}
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg6BorderLayout();
            }
        });
    }
}
