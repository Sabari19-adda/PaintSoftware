package Adda.Boys.PaintSoftware;

public class ConsoleWindow extends Window {
    @Override
    public void open() {
        System.out.println("Opening Console Window");
    }

    @Override
    public void close() {
        System.out.println("Closing Console Window");
    }

    @Override
    public void move() {
        System.out.println("Moving Console Window");
    }

    @Override
    public void display() {
        System.out.println("Displaying  Console Window");
    }
}
