interface ShapeArea {
	public double findArea();
}

class Circle implements ShapeArea{
	private double radius;
	final double PI = 3.14;

	Circle(double radius) {
		this.radius = radius;
	}

	public double findArea() {
		double area;
		area = PI * (radius * radius);
		return area;
	}
}

class Rectangle implements ShapeArea{
	private double length;
	private double width;
	
	Rectangle(double length, double width) {
		this.length = length;
		this.width  = width;
	}

	public double findArea() {
		double area;
		area = (length * width);
		return area;
	}
}

public class P4_3 {
	public static void main(String[] args) {
		
		Circle c = new Circle(7);
		System.out.println(c.findArea());

		Rectangle r = new Rectangle(10, 5);
		System.out.println(r.findArea());
	}
}