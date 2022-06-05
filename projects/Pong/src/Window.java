import javax.swing.JFrame;

public class Window extends JFrame{
    public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;

    public Window(String title) {
        this.setTitle(title);
        this.setSize(WIDTH, HEIGHT);
        this.setLocationRelativeTo(null);
        this.requestFocus();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
