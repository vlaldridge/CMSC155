package Week3;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle with radius " + radius;
    }
}
