package jay.nakum.game.composite;

import jay.nakum.game.Composite;
import jay.nakum.game.leaf.Players;

public class Game extends Composite{
	
	public Game() {
		componentName = "Game";
		components.add(new World());
		components.add(new Players());
		components.add(new Mobs());
	}
}
