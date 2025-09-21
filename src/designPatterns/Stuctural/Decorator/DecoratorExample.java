package designPatterns.Stuctural.Decorator;

// Base Interface
interface Coffee {
    String getDescription();
    double cost();
}

// Concrete Component
class SimpleCoffee implements Coffee {
    public String getDescription() { return "Simple Coffee"; }
    public double cost() { return 5.0; }
}

// Decorator
class MilkDecorator implements Coffee {
    private Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String getDescription() { return coffee.getDescription() + ", Milk"; }
    public double cost() { return coffee.cost() + 2.0; }
}

// Client
public class DecoratorExample {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);

        System.out.println(coffee.getDescription() + " | Cost: $" + coffee.cost());
    }
}

