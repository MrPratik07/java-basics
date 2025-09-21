package designPatterns.Creational.factory;

/// one more example of factory pattern


interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() { System.out.println("Driving a Car"); }
}

class Bike implements Vehicle {
    public void drive() { System.out.println("Riding a Bike"); }
}

// Factory Class
class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("Bike")) {
            return new Bike();
        }
        return null;
    }
}

public class FactoryExample {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.drive(); // Output: Driving a Car

        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        vehicle2.drive(); // Output: Riding a Bike
    }
}

