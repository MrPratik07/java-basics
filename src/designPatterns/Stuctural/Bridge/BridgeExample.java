package designPatterns.Stuctural.Bridge;

// Implementor interface
interface Color {
    void applyColor();
}

// Concrete Implementations
class RedColor implements Color {
    public void applyColor() { System.out.println("Applying Red Color"); }
}
class BlueColor implements Color {
    public void applyColor() { System.out.println("Applying Blue Color"); }
}

// Abstraction
abstract class Shape {
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();
}

// Concrete Abstraction
class Circle extends Shape {
    public Circle(Color color) { super(color); }
    public void draw() {
        System.out.print("Drawing Circle - ");
        color.applyColor();
    }
}

// Client
public class BridgeExample {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedColor());
        redCircle.draw(); // Output: Drawing Circle - Applying Red Color
    }
}

