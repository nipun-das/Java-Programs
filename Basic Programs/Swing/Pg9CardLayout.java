import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pg9CardLayout extends JFrame implements ActionListener {
    CardLayout card;
    JButton btn1, btn2, btn3;
    Container c;

    Pg9CardLayout() {
        c = getContentPane();
        card = new CardLayout(40, 30);
        c.setLayout(card);
        btn1 = new JButton("Apple");
        btn2 = new JButton("Boy");
        btn3 = new JButton("Cat");
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        c.add("a", btn1);
        c.add("b", btn2);
        c.add("c", btn3);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        card.next(c);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg9CardLayout();
            }
        });
    }


}
