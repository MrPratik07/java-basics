package Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(Arrays.asList(new Car(1,"Breeza", 80),
                                                        new Car(2,"Venue", 90),
                                                        new Car(2,"Alto", 20),
                                                        new Car(2,"BMW", 140),
                                                        new Car(3,"verna",75)));

        Collections.sort(cars);
        for(Car car : cars) {
            System.out.println(car.name+ " "+car.speed);
        }

    }
}
