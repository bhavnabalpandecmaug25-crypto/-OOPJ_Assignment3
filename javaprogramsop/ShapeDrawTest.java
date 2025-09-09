abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Drawing Circle of radius " + radius);
    }
}

class Rectangle extends Shape {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void draw() {
        System.out.println("Drawing Rectangle of length " + length + " and breadth " + breadth);
    }
}

public class ShapeDrawTest {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        Rectangle r = new Rectangle(5, 10);
        c.draw();
        r.draw();
    }
}