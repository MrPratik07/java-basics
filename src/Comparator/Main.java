package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
            List<Car> cars = new ArrayList<>(Arrays.asList(new Car(1,"Breeza", 80),
                    new Car(2,"Verna", 80),
                    new Car(2,"Alto", 80),
                    new Car(2,"XUV", 70),
                    new Car(3,"Venue",80)));
        Collections.sort(cars, new SpeedComparator());
        for(Car car : cars) {
            System.out.println(car.name+ " "+car.speed);
        }
        }
}
