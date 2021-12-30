import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.BorderLayout;

class Que9 {
    private JFrame frame1, frame2;
    private JLabel label1, label2;

    private void initFlowWindow() {
        frame1 = new JFrame();
        frame1.setTitle("Flow Layout");
        frame1.setLocationRelativeTo(null);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setLayout(new FlowLayout());

        label1 = new JLabel("Jay Nakum");
        frame1.add(label1);
        label2 = new JLabel("20BCP304D");
        frame1.add(label2);

        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void initBorderWindow() {
        frame2 = new JFrame();
        frame2.setTitle("Border Layout");
        frame2.setLocationRelativeTo(null);
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame2.setLayout(new BorderLayout());

        label1 = new JLabel("Jay Nakum");
        frame2.add(label1, BorderLayout.NORTH);
        label2 = new JLabel("20BCP304D");
        frame2.add(label2, BorderLayout.SOUTH);

        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public Que9() {
        initFlowWindow();
        initBorderWindow();
    }
}

public class P04Q09 {
    public static void main(String[] args) {
        new Que9();
    }
}
