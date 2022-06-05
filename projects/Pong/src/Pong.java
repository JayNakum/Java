class Game {
    private Window mainWindow;
    private Engine engine;

    public void init() {
        mainWindow = new Window("Ping Pong");
        engine = new Engine();
    }

    public void start() {
        engine.start();
        mainWindow.setVisible(true);
    }
}

public class Pong {
    public static void main(String[] args) throws Exception {
        Game pong = new Game();
        pong.init();
        pong.start();
    }
}
