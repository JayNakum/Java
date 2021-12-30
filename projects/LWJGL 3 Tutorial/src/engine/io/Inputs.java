package engine.io;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWCursorPosCallback;
import org.lwjgl.glfw.GLFWKeyCallback;
import org.lwjgl.glfw.GLFWMouseButtonCallback;
import org.lwjgl.glfw.GLFWScrollCallback;

public class Inputs {
	private static boolean[] keys = new boolean[GLFW.GLFW_KEY_LAST];
	private static boolean[] mouseButtons = new boolean[GLFW.GLFW_MOUSE_BUTTON_LAST];
	public static double mousePositionX, mousePositionY;
	public static double scrollX, scrollY;
	
	private GLFWKeyCallback keyBoard;
	private GLFWCursorPosCallback mouseMovement;
	private GLFWMouseButtonCallback mouseClicks;
	private GLFWScrollCallback mouseScroll;
	
	public Inputs() {
		keyBoard = new GLFWKeyCallback() {
			@Override
			public void invoke(long window, int key, int scanCode, int action, int mods) {
				keys[key] = (action != GLFW.GLFW_RELEASE);
			}
		};
		mouseMovement = new GLFWCursorPosCallback() {
			@Override
			public void invoke(long window, double xPosition, double yPosition) {
				mousePositionX = xPosition;
				mousePositionY = yPosition;
			}
		};
		mouseClicks = new GLFWMouseButtonCallback() {
			@Override
			public void invoke(long window, int button, int action, int mods) {
				mouseButtons[button] = (action != GLFW.GLFW_RELEASE);
			}
		};
		mouseScroll = new GLFWScrollCallback() {
			@Override
			public void invoke(long window, double offsetX, double offsetY) {
				scrollX += offsetX;
				scrollY += offsetY;
			}
		};
	}
	
	public static boolean isKeyDown(int key) {
		return keys[key];
	}
	public static boolean isMouseButtonDown(int button) {
		return mouseButtons[button];
	}

	public double getMousePositionX() {
		return mousePositionX;
	}
	public double getMousePositionY() {
		return mousePositionY;
	}
	
	public double getMouseScrollX() {
		return scrollX;
	}
	public double getMouseScrollY() {
		return scrollY;
	}

	public GLFWKeyCallback getKeyBoardCallback() {
		return keyBoard;
	}

	public GLFWCursorPosCallback getMouseMovementCallback() {
		return mouseMovement;
	}

	public GLFWMouseButtonCallback getMouseClicksCallback() {
		return mouseClicks;
	}
	
	public GLFWScrollCallback getMouseScrollCallback() {
		return mouseScroll;
	}
	
	public void destroy() {
		keyBoard.free();
		mouseMovement.free();
		mouseClicks.free();
		mouseScroll.free();
	}
}
