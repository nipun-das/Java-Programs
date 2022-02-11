import javax.swing.*;
import java.awt.*;

public class Pg8FlowLayout {
    JFrame jf;

    Pg8FlowLayout() {
        jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        jf.add(btn1);
        jf.add(btn2);
        jf.add(btn3);
        jf.add(btn4);
        jf.add(btn5);
        jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        jf.setSize(400, 400);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg8FlowLayout();
            }
        });
    }
}
