import javax.swing.JFrame;

public class P04Q04 {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Jay Nakum");
        myFrame.setSize(700, 500);
        myFrame.setLocationRelativeTo(null);
        myFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        myFrame.setVisible(true);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
