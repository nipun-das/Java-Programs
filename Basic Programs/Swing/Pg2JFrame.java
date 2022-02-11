import javax.swing.*;

class Pg2JFrame {
    Pg2JFrame() {
        JFrame jf = new JFrame("Window");
        jf.setSize(1000, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jl = new JLabel("Hello");
        jf.add(jl);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pg2JFrame();
            }
        });
    }
}
