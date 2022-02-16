package jay.nakum.game;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	
	protected List<Component> components = new ArrayList<Component>();

	@Override
	public void render() {
		System.out.println(componentName);
		for(int i = 0; i < components.size(); i++) {
			components.get(i).render();
		}
	}

}
