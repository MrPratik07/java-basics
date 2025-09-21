package DSA;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorMethods {
    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//
//        list.add(1);
//        list.add(2);
//
//        Iterator<Integer> itr = list.iterator();
//
//        while(itr.hasNext()) {
//            Integer element = itr.next();
//            if(element==2) {
//                list.remove(element);
//            }
//        }

        List<Integer> list1 = new CopyOnWriteArrayList<>(Arrays.asList(1,2,3));
        Iterator<Integer> iterator = list1.iterator();

        while(iterator.hasNext()){
            Integer element = iterator.next();
            if(element==3){
                list1.remove(element);
            }
        }

        System.out.println(list1);

    }


}
