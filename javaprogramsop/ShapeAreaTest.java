class Shape {
    public double area() {
        return 0.0; 
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return length * breadth;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
public class ShapeAreaTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle Area = " + rect.area());
        System.out.printf("Circle Area = %.2f\n", circle.area()); 
    }
}