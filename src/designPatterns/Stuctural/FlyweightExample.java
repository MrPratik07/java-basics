package designPatterns.Stuctural;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory
class ShapeFactory {
    private static final Map<String, Circle> circleMap = new HashMap<>();

    public static Circle getCircle(String color) {
        if (!circleMap.containsKey(color)) {
            circleMap.put(color, new Circle(color));
        }
        return circleMap.get(color);
    }
}

// Flyweight Object
class Circle {
    private String color;

    public Circle(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing " + color + " circle");
    }
}

// Client
public class FlyweightExample {
    public static void main(String[] args) {
        Circle c1 = ShapeFactory.getCircle("Red");
        Circle c2 = ShapeFactory.getCircle("Red");

        System.out.println(c1 == c2); // Output: true (same object reused)
    }
}

