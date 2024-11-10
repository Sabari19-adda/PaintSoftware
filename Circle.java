package Adda.Boys.PaintSoftware;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius: " + radius);
    }

    @Override
    public void erase() {
        System.out.println("Erasing circle");
    }

    @Override
    public void move() {
        System.out.println("Moving  Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing  Circle");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
