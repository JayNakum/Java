import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

class Que3 extends JFrame implements KeyListener {
    private JLabel label;

    public Que3() {
        this.setTitle("Jay Nakum");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.addKeyListener(this);

        label = new JLabel("Jay Nakum");
        this.add(label);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        label.setText("Key: " + e.getKeyChar());
        System.out.println("Key Typed");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released");
    }
}

public class P04Q03 {
    public static void main(String[] args) {
        new Que3();
    }
}
