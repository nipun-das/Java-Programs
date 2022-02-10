package com.swing;

import javax.swing.*;

public class Pg3JFrameInheritance extends JFrame {
    Pg3JFrameInheritance(String x) {
        super(x);
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("swing means powerful gui");
        add(jl);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg3JFrameInheritance("A simple swing app");
            }
        });
    }
}
