abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    private int length, width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void area() {
        System.out.println("Area of rectangle = " + (length * width));
    }
}

class Circle extends Shape {
    private int radius;
    final double PI = 3.14;
    Circle(int radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        System.out.println("Area of circle = " + (PI * radius * radius));
    }
}

class Triangle extends Shape {
    private int base, height;
    Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    @Override
    void area() {
        System.out.println("Area of triangle = " + (0.5 * base * height));
    }
}

public class P02Q13 {
    public static void main(String[] args) {
        new Rectangle(10, 20).area();
        new Circle(7).area();
        new Triangle(10, 20).area();
    }
}
