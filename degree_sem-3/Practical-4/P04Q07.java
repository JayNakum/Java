import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.GridLayout;

class Que7{
    private JFrame frame;
    private JLabel name, rollNumber, batch, percentage;

    private void initFrame() {
        frame = new JFrame();
        frame.setTitle("20BCP304D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridLayout(4, 1));
    }
    private void initLabels() {
        name = new JLabel("Name: Jay Nakum");
        frame.add(name);
        rollNumber = new JLabel("Roll Number: 20BCP304D");
        frame.add(rollNumber);
        batch = new JLabel("Batch: CSE20");
        frame.add(batch);
        percentage = new JLabel("Percentage: 98%");
        frame.add(percentage);
    }

    public Que7() {
        initFrame();
        initLabels();
        frame.setVisible(true);
    }
}

public class P04Q07 {
    public static void main(String[] args) {
        new Que7();
    }
}
