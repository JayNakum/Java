import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

public class Players extends Entity {

    @Override
    public void tick() {
        y += speedY;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, 32, 32);
        
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 8, 64);
    }
    
}
