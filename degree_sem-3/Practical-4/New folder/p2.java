import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class p2 extends JFrame implements MouseMotionListener,MouseListener {
	private JLabel lblText;


	p2() {
		this.addMouseMotionListener(this);
		this.addMouseListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);


		lblText = new JLabel("Test text");
		lblText.setBounds(20, 10, 100, 20);
		add(lblText);


		this.setLayout(null);
		this.setVisible(true);
	}


	public void mouseClicked(MouseEvent e) {
		lblText.setText("Mouse Clicked");
	}


	public void mouseEntered(MouseEvent e) {
		lblText.setText("Mouse Entered");
	}


	public void mouseExited(MouseEvent e) {
		lblText.setText("Mouse Exited");
	}


	public void mousePressed(MouseEvent e) {
		lblText.setText("Mouse Pressed");
	}


	public void mouseReleased(MouseEvent e) {
		lblText.setText("Mouse Released");
	}


	public void mouseDragged(MouseEvent e) {
		lblText.setText("Mouse Dragged");
	}


	public void mouseMoved(MouseEvent e) {
	}


	public static void main(String[] args) {
		new p2();
	}
}