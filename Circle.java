package Adda.Boys.PaintSoftware;

public class Circle extends Shape {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing the Circle with radius: " + radius);
    }

    @Override
    public void erase() {
        System.out.println("Erasing the circle for making the changes");
    }

    @Override
    public void move() {
        System.out.println("Moving the Circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing the Circle");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}
