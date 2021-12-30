import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;

import java.awt.Container;

class Que11 {
    private JFrame frame1, frame2;

    private void initBoxWindow() {
        frame1 = new JFrame("Box Layout");
        frame1.setLocationRelativeTo(null);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        frame1.setLayout(new BoxLayout(frame1.getContentPane(), BoxLayout.Y_AXIS));
        
        JButton button1 = new JButton("Button 1");
        frame1.add(button1);
        JButton button2 = new JButton("Button 2");
        frame1.add(button2);
        JButton button3 = new JButton("Button 3");
        frame1.add(button3);
        
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private void initGroupWindow() {
        frame2 = new JFrame("Group Layout");
        frame2.setLocationRelativeTo(null);
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);

        Container contentPanel = frame2.getContentPane();
        GroupLayout groupLayout = new GroupLayout(contentPanel);
        contentPanel.setLayout(groupLayout);

        JLabel label = new JLabel("Jay Nakum");
        JButton button = new JButton("Click Me!");

        groupLayout.setHorizontalGroup(
                groupLayout.createSequentialGroup()
                        .addComponent(label)
                        .addGap(10, 25, 40)
                        .addComponent(button));
        groupLayout.setVerticalGroup(
                groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(label)
                        .addComponent(button));

        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public Que11() {
        initBoxWindow();
        initGroupWindow();
    }
}

public class P04Q11 {
    public static void main(String[] args) {
        new Que11();
    }
}
