package designPatterns.Creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShapeInstance("Circle");
        circle.computeArea();
    }
}
