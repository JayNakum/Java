package jaynakum;

import java.util.Random;

import jaynakum.gameObjects.BasicEnemy;
import jaynakum.gameObjects.BossEnemy1;
import jaynakum.gameObjects.FastEnemy;
import jaynakum.gameObjects.ID;
import jaynakum.gameObjects.SmartEnemy;

public class Spawn {
    private Handler handler;
    private HUD hud;
    private int scoreKeep = 0;
    private Random random = new Random();

    public Spawn(Handler handler, HUD hud) {
        this.handler = handler;
        this.hud = hud;
    }

    public void tick() {
        scoreKeep++;
        if (scoreKeep >= 250) {
            scoreKeep = 0;
            // hud.setScore(0);
            if(hud.getLevel() <= 15) {
                hud.setLevel(hud.getLevel() + 1);
            }
            if (hud.getLevel() == 3) {
                handler.addObject(
                        new BasicEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.BasicEnemy));
            // } else if (hud.getLevel() == 3) {
            //     handler.addObject(
            //             new BasicEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.BasicEnemy));
            } else if (hud.getLevel() == 5) {
                handler.addObject(
                        new FastEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.FastEnemy));
            } else if (hud.getLevel() == 7) {
                handler.addObject(new SmartEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2),
                        ID.SmartEnemy, handler));
            } else if (hud.getLevel() == 9) {
                handler.addObject(
                        new BasicEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.BasicEnemy));
            // } else if (hud.getLevel() == 7) {
            //     handler.addObject(
            //             new BasicEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.BasicEnemy));
            } else if (hud.getLevel() == 11) {
                handler.addObject(
                        new FastEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2), ID.FastEnemy));
            } else if (hud.getLevel() == 13) {
                handler.addObject(new SmartEnemy(random.nextInt(Game.WIDTH / 2), random.nextInt(Game.HEIGHT / 2),
                        ID.SmartEnemy, handler));
            } else if (hud.getLevel() == 15) {
                handler.clearEnemies();
                handler.addObject(new BossEnemy1((Game.WIDTH / 2) - 48, -100, ID.BossEnemy1, handler));
            }
        }
    }
}
