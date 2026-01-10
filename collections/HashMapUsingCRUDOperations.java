package collections;
import java.util.HashMap;
import java.util.Map;


public class HashMapUsingCRUDOperations {
    public static void main(String[] args) {
        // HashMap is a class that: Stores data in key–value pairs,
        // Keys are unique.
        // Values can be duplicated.
        // Does NOT maintain insertion order.
        // Allows one null key and multiple null values.
        // HashMap doesnot comes under Collections.
        HashMap<Integer,String> courses = new HashMap<>();
        //CREATE
        courses.put(0, "Java");
        courses.put(1,"Python");
        courses.put(2,"C++");
        courses.put(3,"React");

        //READ
        System.out.println("Courses: ");
        for(Map.Entry<Integer, String> entry:courses.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        //UPDATE
        courses.put(2, "C-Programming");

        System.out.println(courses);

        //DELETE

        courses.remove(2);

        System.out.println("Final Values: "+courses);
    }
}
