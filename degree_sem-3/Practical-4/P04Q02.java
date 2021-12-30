import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

class Que2 extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel label;

    public Que2() {
        this.setTitle("Jay Nakum");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.addMouseListener(this);
        
        label = new JLabel("Jay Nakum");
        this.add(label);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Released");
    }

    public void mouseDragged(MouseEvent e) {
        label.setText("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) {
        label.setText("Mouse is Moving");
    }
}

public class P04Q02 {
    public static void main(String[] args) {
        new Que2();
    }
}
