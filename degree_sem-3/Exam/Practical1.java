import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class MainWindow extends Canvas implements MouseListener {
    
    private boolean isReverse = false;
    private static char alpha = 97;

    private JFrame myFrame;

    private void initWindow() {
        myFrame = new JFrame("Jay Nakum - 20BCP304D");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        myFrame.setLocationRelativeTo(null);
        this.addMouseListener(this);
        myFrame.add(this);
    }

    public MainWindow() {
        initWindow();
        myFrame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (alpha <= 'a') {
            isReverse = false;
        }
        if (alpha >= 'z') {
            isReverse = true;
        }

        Graphics g = getGraphics();
        g.drawString("" + alpha, e.getX(), e.getY());

        if (!isReverse) {
            MainWindow.alpha += 1;
        } else {
            MainWindow.alpha -= 1;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}

public class Practical1 {
    public static void main(String[] args) {
        new MainWindow();
    }
}