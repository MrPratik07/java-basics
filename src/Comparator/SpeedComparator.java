package Comparator;

import java.util.Comparator;

class SpeedComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        if(o1.speed == o2.speed){
            return o1.name.compareTo(o2.name);
        } else if(o1.speed > o2.speed){
            return 1;
        } else {
            return -1;
        }
    }
}
