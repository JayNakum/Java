package jay.nakum.shape;

interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}

class BlueShapeDecorator extends ShapeDecorator {
	boolean is3D = false;
    public BlueShapeDecorator(Shape decoratedShape, boolean is3D) {
        super(decoratedShape);
        this.is3D = is3D;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBorder(decoratedShape);
        if(is3D) {
        	set3d(decoratedShape);
        }
    }

    private void setBorder(Shape decoratedShape) {
        System.out.println("Border Color: Blue");
    }
    private void set3d(Shape decoratedShape) {
        System.out.println("Converted to 3D");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("\nCircle with normal border");
        circle.draw();

        Shape redCircle = new BlueShapeDecorator(new Circle(), false);
        System.out.println("\nCircle of blue border");
        redCircle.draw();

        Shape redRectangle = new BlueShapeDecorator(new Rectangle(), true);
        System.out.println("\nRectangle of blue border");
        redRectangle.draw();

    }
}
