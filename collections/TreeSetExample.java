package collections;
import java.util.TreeSet;
//TreeSet with Custom Objects (Comparable)
class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public int compareTo(Student s){
        return this.id - s.id;
    }
    public String toString(){
        return id+" "+name;
    }
}
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java");
        //set.add(null); Throws NullPointerException.
        System.out.println(set);

        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.first());
        System.out.println(numbers.last());

        numbers.higher(10);
        numbers.lower(20);
        

        System.out.println(numbers);

        TreeSet<Student> student = new TreeSet<>();

        student.add(new Student(0, "Karthik"));
        student.add(new Student(1,"Kalyan"));
        student.add(new Student(2, "Poojitha"));
        student.add(new Student(3, "Rahul"));

        System.out.println(student);
        
    }
}
