package DSA;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        System.out.println(queue.peek());
        System.out.println(queue.poll());


        Queue<Integer> queue1 =  new PriorityQueue<>();
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());
        System.out.println(queue1.poll());

        Queue<Integer> queue2 =  new PriorityQueue<>(Comparator.reverseOrder());
        queue2.add(2);
        queue2.add(3);
        queue2.add(4);
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
        System.out.println(queue2.poll());
    }
}
