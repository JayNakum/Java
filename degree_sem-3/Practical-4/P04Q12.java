import java.applet.Applet;
import java.awt.Graphics;

// <html>
// <applet code = P04Q12
// 		width = 500
// 		height = 400>
// 	</applet>
// </html>

public class P04Q12 extends Applet {
    public void init() {
        System.out.println("Initialize");
    }

    public void start() {
        System.out.println("Start");
    }

    public void paint(Graphics graphics) {
        System.out.println("Paint");
        graphics.drawString("Hello World", 25, 25);
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void destroy() {
        System.out.println("Destroy");
    }
}
