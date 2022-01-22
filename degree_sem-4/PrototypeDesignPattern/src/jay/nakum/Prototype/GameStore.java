package jay.nakum.Prototype;

import java.util.HashMap;
import java.util.Map;

public class GameStore {
	private Map<String, Game> gameMap;
	
	public GameStore() {
		this.gameMap = new HashMap<String, Game>();
		add();
	}
	public GameStore(Map<String, Game> gameMap) {
		this.gameMap = gameMap;
	}
	
	private void add() {
		gameMap.put("Minecraft", new Minecraft());
		gameMap.put("ForzaHorizon", new ForzaHorizon());
		gameMap.put("CallOfDuty", new CallOfDuty());
	}
	
	public Game getGame(String key) {
		return (Game) gameMap.get(key).clone();
	}
	
}
