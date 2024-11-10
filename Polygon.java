package Adda.Boys.PaintSoftware;

public class Polygon extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing the  Polygon");
    }

    @Override
    public void erase() {
        System.out.println("Erasing the Polygon");
    }

    @Override
    public void move() {
        System.out.println("Moving the Polygon");
    }

    @Override
    public void resize() {
        System.out.println("Resizing  Polygon");
    }
}
