package Comparator;

import java.util.Comparator;

class NameComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.name.compareTo(o2.name);
    }
}
