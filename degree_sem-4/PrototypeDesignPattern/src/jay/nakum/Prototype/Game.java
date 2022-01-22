package jay.nakum.Prototype;

public abstract class Game implements Cloneable{
	
	protected String gameName;
	
	abstract void hello();
	
	public Object clone() {
		
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
		
	}
	
}
