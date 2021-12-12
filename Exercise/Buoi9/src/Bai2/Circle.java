package Bai2;

public class Circle implements IShape {
    private double radius;

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
