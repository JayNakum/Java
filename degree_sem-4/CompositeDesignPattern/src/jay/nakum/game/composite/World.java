package jay.nakum.game.composite;

import jay.nakum.game.leaf.terrain.Caves;
import jay.nakum.game.leaf.terrain.Cliffs;
import jay.nakum.game.leaf.terrain.Land;
import jay.nakum.game.Composite;
import jay.nakum.game.leaf.structures.City;
import jay.nakum.game.leaf.structures.Village;

public class World extends Composite {
	public World() {
		componentName = "|___World";
		components.add(new Terrain());
		components.add(new Structures());
	}
}

class Terrain extends Composite {
	public Terrain() {
		componentName = "|   |___Terrain";
		components.add(new Land());
		components.add(new Caves());
		components.add(new Cliffs());
	}
}

class Structures extends Composite {
	public Structures() {
		componentName = "|   |___Structures";
		components.add(new City());
		components.add(new Village());
	}
}

