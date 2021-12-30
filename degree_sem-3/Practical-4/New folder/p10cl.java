// importing swing package for JFrame, Jbutton controls
import javax.swing.*;
// importing to use Container class
import java.awt.*;
// importing to use event listeners
import java.awt.event.*;

public class p10cl extends JFrame {
	private CardLayout cl = new CardLayout();
	private Container panel = getContentPane();
	
	public p10cl(){
		// Setting Title to the JFrame GUI
		setTitle("Card Layout Test Java Code");

		// Adding buttons using Grid Layout
		JButton button1 = new JButton("Button1");
		button1.setBackground(Color.green);
		JButton button2 = new JButton("Button2");
		button2.setBackground(Color.blue);
		JButton button3 = new JButton("Button3");
		button3.setBackground(Color.magenta);
		JButton button4 = new JButton("Button4");
		button4.setBackground(Color.red);
		// Setting card  layout to JFrame GUI
		setLayout(cl);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		button1.addActionListener(new ButtonListener());
		button2.addActionListener(new ButtonListener());
		button3.addActionListener(new ButtonListener());
		button4.addActionListener(new ButtonListener());
	}
	class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ae){
			cl.next(panel);
		}
	}
	public static void main(String[] args){
		// Create JFrame for GUI frame and title as 'Add Button in JFrame Java Code'
		p10cl frame = new p10cl();
		frame.setSize(500,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}