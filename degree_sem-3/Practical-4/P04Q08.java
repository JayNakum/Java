import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Que8 extends JFrame implements ActionListener {
    private JButton exit;

    public Que8() {
        this.setTitle("Jay Nakum");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setLayout(new FlowLayout());

        exit = new JButton("Click to exit");
        exit.setSize(200, 150);
        exit.addActionListener(this);
        this.add(exit);

        this.setVisible(true);
        // this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        int option = JOptionPane.showConfirmDialog(this, "This will close the app!\nAre you sure?", "Are you sure?", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

public class P04Q08 {
    public static void main(String[] args) {
        new Que8();
    }
}
