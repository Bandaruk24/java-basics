package collections;
import java.util.ArrayList;

public class ArrayListCRUDOperations {
    public static void main(String[] args) {
        //ArrayList is a resizable array that contains duplicates and insertion order.
        // CRUD stands for CREATE READ UPDATE and DELETE
        // Creating an ArrayList
        ArrayList<String> names =new ArrayList<>();
        names.add("Apple");
        names.add("Banana");
        names.add("Mango");

        // READ
        System.out.println("Reading Elements");
        for(String name : names){
            System.out.println(name);
        }
        // UPDATE updating elements
        names.set(0,"Java");
        names.set(1,"Collection");
        names.set(2,"FrameWorks");

        // DELETE deleting element
        names.remove(0);
        System.out.println("Final List: "+names);
    }
}