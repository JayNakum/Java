import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Que5 extends JFrame implements ActionListener{

    private int counter = 0;
    private JLabel label;
    private JButton button;

    public Que5() {
        this.setTitle("Jay Nakum");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new FlowLayout());

        label = new JLabel("Jay Nakum");
        this.add(label);
        button = new JButton("Click Me!");
        button.addActionListener(this);
        button.setSize(200, 150);
        this.add(button);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("Clicked " + (++counter) + " times.");
    }
}

public class P04Q05 {
    public static void main(String[] args) {
        new Que5();
    }
}
