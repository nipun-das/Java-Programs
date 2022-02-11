import javax.swing.*;

import java.awt.event.*;

public class Pg5JFrameButtonAction extends JFrame implements ActionListener {
    JTextField txt;
    JButton btn1, btn2;

    Pg5JFrameButtonAction() {
        txt = new JTextField();
        txt.setBounds(90, 50, 100, 30);
        add(txt);
        btn1 = new JButton("Button 1");
        btn1.setBounds(90, 90, 100, 30);
        btn1.addActionListener(this);
        add(btn1);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            txt.setText("Welcome!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg5JFrameButtonAction();
            }
        });
    }
}
