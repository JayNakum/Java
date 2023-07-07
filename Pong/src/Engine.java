public class Engine implements Runnable {

    private Thread mainThread;
    private boolean isRunning = false;

    public synchronized void start() {
        mainThread = new Thread(this);
        mainThread.start();
        isRunning = true;
    }

    public synchronized void stop() {
        try {
            mainThread.join();
            isRunning = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void tick() {
        
    }

    private void render() {
    
    }

    @Override
    public void run() {
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
                System.out.println(frames + " FPS");
                frames = 0;
            }
        }
        stop();
    }

}
