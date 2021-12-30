package engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWWindowSizeCallback;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;

import engine.maths.Vector3f;

public class WindowManager {
	private long window;
	private int width, height;
	private String title;
	
	public int frames;
	public static long time;
	
	private Inputs inputs;
	
//	private float backgroundR, backgroundG, backgroundB;
	private Vector3f background = new Vector3f(0, 0, 0);
	
	private GLFWWindowSizeCallback sizeCallback;
	private boolean isResized = false, isFullscreen = false;
	private int[] windowPositionX = new int[1], windowPositionY = new int[1];
	
	public WindowManager(int width, int height, String title) {
		this.width = width;
		this.height = height;
		this.title = title;
	}
	
	public void create() {
		if (!GLFW.glfwInit()) {
			System.err.println("ERROR: Cannot initialize GLFW");
			return;
		}
		
		window = GLFW.glfwCreateWindow(width, height, title, isFullscreen ? GLFW.glfwGetPrimaryMonitor() : 0 , 0);
		inputs = new Inputs();
		
		if (window == 0) {
			System.err.println("ERROR: Cannot create window");
			return;
		}
		
		GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());
		windowPositionX[0] = (videoMode.width() - width) / 2;
		windowPositionY[0] = (videoMode.height() - height) / 2;
		GLFW.glfwSetWindowPos(window, windowPositionX[0], windowPositionY[0]);
		
		GLFW.glfwMakeContextCurrent(window);
		GL.createCapabilities();
		GL11.glEnable(GL11.GL_DEPTH_TEST);
		
		createCallbacks();
		
		GLFW.glfwShowWindow(window);
		
		GLFW.glfwSwapInterval(1);
		time = System.currentTimeMillis();
	}
	
	private void createCallbacks() {
		sizeCallback = new GLFWWindowSizeCallback() {
			@Override
			public void invoke(long window, int newWidth, int newHeight) {
				width = newWidth;
				height = newHeight;
				isResized = true;
			}
		};
		GLFW.glfwSetKeyCallback(window, inputs.getKeyBoardCallback());
		GLFW.glfwSetCursorPosCallback(window, inputs.getMouseMovementCallback());
		GLFW.glfwSetMouseButtonCallback(window, inputs.getMouseClicksCallback());
		GLFW.glfwSetScrollCallback(window, inputs.getMouseScrollCallback());
		GLFW.glfwSetWindowSizeCallback(window, sizeCallback);
	}
	
	public void update() {
		if(isResized) {
			GL11.glViewport(0, 0, width, height);
			isResized = false;
		}
//		GL11.glClearColor(backgroundR, backgroundG, backgroundB, 1.0f);
		GL11.glClearColor(background.getX(), background.getY(), background.getZ(), 1.0f);
		GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
		
		GLFW.glfwPollEvents();
		frames++;
		if (System.currentTimeMillis() > time + 1000) {
			GLFW.glfwSetWindowTitle(window, title + " | FPS: " + frames);
			time = System.currentTimeMillis();
			frames = 0;
		}
	}
	
	public void swapBuffers() {
		GLFW.glfwSwapBuffers(window);
	}
	
	public void closeWindow() {
		inputs.destroy();
		sizeCallback.free();
		GLFW.glfwWindowShouldClose(window);
		GLFW.glfwDestroyWindow(window);
		GLFW.glfwTerminate();
	}
	
	public boolean shouldClose() {
		return GLFW.glfwWindowShouldClose(window);
	}
	
	public void setBackgroundColor(float r, float g, float b) {
//		backgroundR = r;
//		backgroundG = g;
//		backgroundB = b;
		background.set(r, g, b);
	}
	
	public boolean isFullscreen() {
		return isFullscreen;
	}

	public void setFullscreen(boolean isFullscreen) {
		this.isFullscreen = isFullscreen;
		isResized = true;
		if (isFullscreen) {
			GLFW.glfwGetWindowPos(window, windowPositionX, windowPositionY);
			GLFW.glfwSetWindowMonitor(window, GLFW.glfwGetPrimaryMonitor(), 0, 0, width, height, 0);
		} else {
			GLFW.glfwSetWindowMonitor(window, 0, windowPositionX[0], windowPositionY[0], width, height, 0);
		}
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String getTitle() {
		return title;
	}

	public long getWindow() {
		return window;
	}
}