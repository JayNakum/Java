import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;

import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Que10 {
    private JFrame frame1, frame2;
    private JLabel label1, label2;

    private JButton button1, button2, button3;
	private Container panel;
    private  CardLayout cardLayout;

    private void initGridWindow() {
        frame1 = new JFrame();
        frame1.setTitle("Grid Layout");
        frame1.setLocationRelativeTo(null);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setLayout(new GridLayout(2, 1));

        label1 = new JLabel("Jay Nakum");
        frame1.add(label1);
        label2 = new JLabel("20BCP304D");
        frame1.add(label2);

        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void initCardWindow() {
        frame2 = new JFrame();
        panel = frame2.getContentPane();
        frame2.setTitle("Card Layout");
        frame2.setLocationRelativeTo(null);
        frame2.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        cardLayout = new CardLayout();
        frame2.setLayout(cardLayout);


        button1 = new JButton("Page 1\nNext ->");
        button1.addActionListener(new ButtonListener());
        frame2.add(button1);

        button2 = new JButton("Page 2\nNext ->");
        button2.addActionListener(new ButtonListener());
        frame2.add(button2);

        button3 = new JButton("Page 3\nFirst >>");
        button3.addActionListener(new ButtonListener());
        frame2.add(button3);

        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            cardLayout.next(panel);
        }
    }

    public Que10() {
        initGridWindow();
        initCardWindow();
    }
}

public class P04Q10 {
    public static void main(String[] args) {
        new Que10();
    }
}
