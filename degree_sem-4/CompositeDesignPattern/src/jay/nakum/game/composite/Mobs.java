package jay.nakum.game.composite;

import jay.nakum.game.Composite;
import jay.nakum.game.leaf.friendly.Birds;
import jay.nakum.game.leaf.friendly.Dogs;
import jay.nakum.game.leaf.unfriendly.Skeletons;
import jay.nakum.game.leaf.unfriendly.Zombies;

public class Mobs extends Composite{
	public Mobs() {
		componentName = "|___Mobs";
		components.add(new Friendly());
		components.add(new Unfriendly());
	}
}

class Friendly extends Composite {
	public Friendly() {
		componentName = "    |___Friendly";
		components.add(new Dogs());
		components.add(new Birds());
	}
}

class Unfriendly extends Composite {
	public Unfriendly() {
		componentName = "    |___Un-friendly";
		components.add(new Zombies());
		components.add(new Skeletons());
	}
}
