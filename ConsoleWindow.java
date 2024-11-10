package Adda.Boys.PaintSoftware;

public class ConsoleWindow extends Window {
    @Override
    public void open() {
        System.out.println("Opening the Console Window");
    }

    @Override
    public void close() {
        System.out.println("Closing the Console Window");
    }

    @Override
    public void move() {
        System.out.println("Moving the Console Window");
    }

    @Override
    public void display() {
        System.out.println("Displaying the Console Window");
    }
}
