package Adda.Boys.PaintSoftware;

public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing the Rectangle");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Rectangle");
    }

    @Override
    public void move() {
        System.out.println("Moving the Rectangle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing  Rectangle");
    }
}
