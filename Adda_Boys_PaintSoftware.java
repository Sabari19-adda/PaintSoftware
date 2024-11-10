
package Adda.Boys.PaintSoftware;

public class Adda_Boys_PaintSoftware {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        circle.draw();
        circle.erase();
        circle.move();
        circle.resize();

        Window consoleWindow = new ConsoleWindow();
        consoleWindow.open();
        consoleWindow.display();
    }
}
