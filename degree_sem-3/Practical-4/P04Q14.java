// <html>
// <applet code = P04Q14
// 		width = 500
// 		height = 400>
// 	</applet>
// </html>

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class P04Q14 extends Applet {
    public void init() {
        setBackground(Color.black);
    }

    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.drawString("Hello World!", 10, 10);
    }
}
