
import javax.swing.*;

public class Pg1JFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Window");
        jf.setVisible(true);
        jf.setSize(1000, 600);
        JLabel jl = new JLabel("Hello");
        jf.add(jl);
    }
}

