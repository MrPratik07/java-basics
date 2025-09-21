package designPatterns.Creational.prototype;

public class Car implements ProtoType {
    int id;
    private String name;
    long speed;

    public Car(int id, String name, long speed) {
        this.id=id;
        this.name=name;
        this.speed=speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }

    @Override
    public ProtoType clone() {
        return new Car(id, name, speed);
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car(1,"skoda",150);
        Car cloneCar = (Car) car.clone();
        System.out.println(cloneCar);
    }
}
