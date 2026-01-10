package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetVsLinkedHashSet {
    public static void main(String[] args) {
        // HashSet is a class that doesnot allow duplicates.
        // No insertion Order.
        // Stores only one null value.
        // Internal Working: Hash Table → Elements stored based on hash code

        // Creating a HashSet.
        HashSet<String> set = new HashSet<>();
        
        //Inserting elements. 
        set.add("Java");
        set.add("Python");
        set.add("JavaScript");
        set.add("C++");
        set.add("Python");//duplicate
        set.add(null);
        System.out.println("Printing HashSet: ");
        System.out.println(set);

        // LinkedHashSet is HashSet+LinkedList. 
        // LinkedHashset is a subclass of Hashset.
        // Maintain Insertion order and no duplicates allowed.
        // Stores only one null value.
        // Internal Working: Hash Table + Doubly Linked List → Maintains order

        //Creating a LinkedHashSet
        LinkedHashSet<String> set1= new LinkedHashSet<>();

        set1.add("Java");
        set1.add("Python");
        set1.add("JavaScript");
        set1.add("Python");
        set1.add("C++");
        set1.add(null);
        System.out.println("Printing LinkedHashSet: ");
        System.out.println(set1);
    }
}
