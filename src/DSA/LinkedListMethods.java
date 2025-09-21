package DSA;

import java.util.LinkedList;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListMethods {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        System.out.println(list);
        System.out.println(list.remove());
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());


        //reverse linkedList
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        //  1-> 2-> 3-> 4-> null
        System.out.println(reverseList(head));


    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next; // Save the next node
            current.next = prev;  // Reverse the link
            prev = current;       // Move prev to the current node
            current = nextNode;   // Move to the next node
        }
        return prev;  // prev is
    }
}
