import javax.swing.*;

public class Pg4JFrameButtonTxtField extends JFrame {
    JTextField txt;
    JButton btn1,btn2;
    Pg4JFrameButtonTxtField(){
        txt = new JTextField();
        txt.setBounds(90,50,100,30);
        add(txt);
        btn1 = new JButton("Button 1");
        btn1.setBounds(90,90,100,30);
        add(btn1);
        btn2 = new JButton("Button 2");
        btn2.setBounds(90,130,100,30);
        add(btn2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(400,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                new Pg4JFrameButtonTxtField();
            }
        });
    }
}
