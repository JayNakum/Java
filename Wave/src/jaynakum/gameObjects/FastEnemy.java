package jaynakum.gameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

import jaynakum.Game;

public class FastEnemy extends GameObject {

    public FastEnemy(int x, int y, ID id) {
        super(x, y, id);
        speedX = 9;
        speedY = 9;
    }

    @Override
    public void tick() {
        x += speedX;
        y += speedY;

        if (y <= 0 || y >= Game.HEIGHT - 65)
            speedY *= -1;
        if (x <= 0 || x >= Game.WIDTH - 25)
            speedX *= -1;
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, 16, 16);
    }

    @Override
    public Rectangle getBounds() {
        return new Rectangle(x, y, 16, 16);
    }
}
