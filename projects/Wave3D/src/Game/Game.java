package Game;


import java.awt.Canvas;

public class Game extends Canvas implements Runnable{
    private boolean isRunning = false;
    private Thread mainThread;

    public void tick() {}
    public void render() {}
    
    @Override
    public void run() {
        this.requestFocus();
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (isRunning)
                render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                // System.out.println("FPS = " + frames);
                WindowManager.frames = frames;
                frames = 0;
            }
        }
        stop();
    }
    
    public void start() {
        mainThread = new Thread(this);
        mainThread.start();
        isRunning = true;
    }
    public void stop() {
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            isRunning = false;
        }
    }
}
