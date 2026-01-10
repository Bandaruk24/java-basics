package collections;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList example: LinkedList is a linear data structure where elements are stored as nodes with references to the next element. 
        LinkedList<String> list = new LinkedList<>();
        // LinkedList CRUD : CREATE, READ, UPDATE, DELETE.

        // CREATE Creating a linkedlist
        list.add("Hello");
        list.add("Java");
        list.add("Programmer");
        list.add("Learn FrameWorks");

        // READ
        System.out.println("Reading elements: ");
        for(String val : list){
            System.out.println(val);
        }

        // UPDATE updating elements
        list.set(0,"Hi");
        list.set(3,"Learn Collection FrameWorks");

        // DELETE removing an element
        list.remove(1);
        System.out.println("Final List: "+list);

        //LinkedList as Queue
        LinkedList<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);

        System.out.println(queue);
        
        queue.poll();
        System.out.println(queue);

        // LinkedList as a Deque
        LinkedList<Integer> deque = new LinkedList<>();

        deque.addFirst(1);
        deque.add(5);
        deque.addLast(10);

        System.out.println(deque);

        deque.removeLast();
        System.out.println(deque);
    }
}
