import java.applet.Applet;
import java.awt.Graphics;
import javafx.application.Application;
/* 
<applet code="AppletLifeCycle.class" width="500" height="500"> 
</applet> 
 */
public class p12 extends Applet {
    String s;
    public void init() {
        s = "Welcome to Java Applet";
        System.out.println("Inside init method");
    }
    public void start() {
        System.out.println("Inside start method");
    }
    public void paint(Graphics g) {
        System.out.println("Inside paint method");
        g.drawString(s, 100, 100);
    }
    public void stop() {
        System.out.println("Inside stop method");
    }
    public void destroy() {
        System.out.println("Inside destroy method");
    }
}