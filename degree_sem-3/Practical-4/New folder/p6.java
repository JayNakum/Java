import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
class MyMenu{
    private JFrame frame;
    private JMenuBar menuBar;
    private JMenu menu;
    private JMenuItem dms, dsa, oop, mpi, deco, oe;
    private void initFrame() {
        frame = new JFrame();
        frame.setTitle("20BCP327D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
    }private void initMenu() {
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        menu = new JMenu("Subjects");
        menuBar.add(menu);
        dms = new JMenuItem("Discrete Mathematical Structures");
        menu.add(dms);
        dsa = new JMenuItem("Data Structures");
        menu.add(dsa);
        oop = new JMenuItem("Object Oriented Programming with Java");
        menu.add(oop);
        mpi = new JMenuItem("Microprocessor Programming and Interfacing");
        menu.add(mpi);
        deco = new JMenuItem("Digital Electronics and Computer Organization");
        menu.add(deco);
        oe = new JMenuItem("Open Elective");
        menu.add(oe);
    }public MyMenu() {
        initFrame();
        initMenu();
        frame.setVisible(true);
    }
}public class p6 {
    public static void main(String[] args) {
        new MyMenu();
    }
}