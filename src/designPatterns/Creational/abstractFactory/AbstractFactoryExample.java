package designPatterns.Creational.abstractFactory;

// Abstract Product Interfaces
interface Button {
    void paint();
}


//interface Checkbox {
//    void render();
//}

// Concrete Products
class WindowsButton implements Button {
    public void paint() { System.out.println("Windows Button Created"); }
}
class MacOSButton implements Button {
    public void paint() { System.out.println("MacOS Button Created"); }
}

// Abstract Factory
interface GUIFactory {
    Button createButton();
}

// Concrete Factories
class WindowsFactory implements GUIFactory {
    public Button createButton() { return new WindowsButton(); }
}
class MacOSFactory implements GUIFactory {
    public Button createButton() { return new MacOSButton(); }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory(); // Switch factory as needed
        Button button = factory.createButton();
        button.paint(); // Output: Windows Button Created

        GUIFactory factory1 = new MacOSFactory();
        Button button1 = factory1.createButton();
        button1.paint(); // Output: macOS Button Created
    }
}

