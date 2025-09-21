package Comparable;

class Car implements Comparable<Car>{
    int id;
    String name;
    long speed;

    public Car(int id, String name, long speed) {
    this.id = id;
    this.name=name;
    this.speed=speed;
    }

    @Override
    public int compareTo(Car o) {
        return (int) (this.speed - o.speed);
    }
}
