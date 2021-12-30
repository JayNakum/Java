package main;

import org.lwjgl.glfw.GLFW;

import engine.graphics.Mesh;
import engine.graphics.Renderer;
import engine.graphics.Vertex;
import engine.io.Inputs;
import engine.io.WindowManager;
import engine.maths.Vector3f;

public class Main implements Runnable {
	public Thread game;
	public static WindowManager window;
	public static final int WIDTH = 1280, HEIGHT = 760;
	
	public Renderer renderer;
	
	public Mesh mesh = new Mesh(new Vertex[] {
			new Vertex(new Vector3f(-0.1f, 0.1f, 0.0f)),
			new Vertex(new Vector3f(0.1f, 0.1f, 0.0f)),
			new Vertex(new Vector3f(0.1f, -0.1f, 0.0f)),
			new Vertex(new Vector3f(-0.1f, -0.1f, 0.0f))
	}, new int[] {
			0, 1, 2,
			0, 3, 2
	});
	
	public void start() {
		game = new Thread(this, "game");
		game.start();
	}
	
	public void init() {
		window = new WindowManager(WIDTH, HEIGHT, "Game");
		renderer = new Renderer();
		window.setBackgroundColor(0.0f, 1.0f, 0.0f);
//		window.setFullscreen(true);
		window.create();
		mesh.create();
	}
	
	public void run() {
		init();
		while (!window.shouldClose() && !Inputs.isKeyDown(GLFW.GLFW_KEY_ESCAPE)) {
			update();
			render();
			if(Inputs.isKeyDown(GLFW.GLFW_KEY_F11)) {
				window.setFullscreen(!window.isFullscreen());
			}
		}
		window.closeWindow();
	}
	
	private void update() {
		window.update();
//		if(Inputs.isMouseButtonDown(GLFW.GLFW_MOUSE_BUTTON_LEFT)) {
//			System.out.println("(" + Inputs.scrollX + ", " + Inputs.scrollY + ")");
//		}
	}
	
	private void render() {
		renderer.renderMesh(mesh);
		window.swapBuffers();
	}
	
	public static void main(String[] args) {
		new Main().start();
	}
}