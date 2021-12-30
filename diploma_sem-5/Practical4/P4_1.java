class Rect {

	protected double length;
	protected double width;

	Rect(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calcArea() {
		return length * width;
	}
}

class Cube extends Rect {
	
	//super();

	protected double height;

	Cube(double length, double width, double height) {
		super(length, width);
		this.height = height;
	}

	public double calcVolume() {
		return length * width *height;
	}

}

public class P4_1 {
	public static void main(String[] args) {
		Cube c = new Cube(5, 5, 10);
		
		double area = c.calcArea();
		double volume = c.calcVolume();

		System.out.println("Area: " + area);
		System.out.println("Volume: " + volume);
	}
}