
public class Camera {

	private int x, y;
	private Handler handler;
	private GameObject tempPlayer = null;
	
	public Camera(int x, int y, Handler handler) {
		this.x = x;
		this.y = y;
		this.handler = handler;
		
		findPlayer();
	}
	
	public void findPlayer() {
		for(int i = 0; i < handler.object.size(); i++) {
			if(handler.object.get(i).getId() == ID.Player) {
				tempPlayer = handler.object.get(i);
				break;
			}
		}
		
		//JOptionPane.showMessageDialog(null, "Could not a find a player");
	}

	public void tick() {
		
		if(tempPlayer != null) {
			x = (int) tempPlayer.x - Game.WIDTH/2 + 16;
			y = (int) tempPlayer.y - Game.HEIGHT/2 + 16;
		}else findPlayer();
		
		
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
}
