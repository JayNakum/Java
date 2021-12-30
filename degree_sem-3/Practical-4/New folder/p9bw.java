//Java Program illustrating the BorderLayout
import java.awt.*;
import javax.swing.*;
public class p9bw
{
JFrame JF;
p9bw()
{
JF=new JFrame(); //JFrame object
//Lying at top, will be the button named 'North'
JButton b1=new JButton("NORTH");
//Lying at bottom, will be the button named 'South'
JButton b2=new JButton("SOUTH");
//Lying at left, will be the button named 'East'
JButton b3=new JButton("EAST");
//Lying at right, will be the button named 'West'
JButton b4=new JButton("WEST");
//In the center, will be the button named 'Center'
JButton b5=new JButton("CENTER");
//Adding our buttons
JF.add(b1,BorderLayout.NORTH);
JF.add(b2,BorderLayout.SOUTH);
JF.add(b3,BorderLayout.EAST);
JF.add(b4,BorderLayout.WEST);
JF.add(b5,BorderLayout.CENTER);
//Function to set size of the Frame
JF.setSize(300, 300);
//Function to set visible status of the frame
JF.setVisible(true);
}
//Driver Code
public static void main(String[] args)
{
//Calling the constructor
new p9bw();
}
}