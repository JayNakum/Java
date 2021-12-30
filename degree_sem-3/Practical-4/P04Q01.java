import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
   
class Que1 extends JFrame implements WindowListener {
    public Que1() {
        this.setTitle("Jay Nakum");
        this.setSize(700, 500);
        this.setLocationRelativeTo(null);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.addWindowListener(this);

        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");        
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");        
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");        
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");        
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");        
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");        
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");        
    }    
}

public class P04Q01 {
    public static void main(String[] args) {
        new Que1();
    }
}
