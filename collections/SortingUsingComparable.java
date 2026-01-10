package collections;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int roll;   
    String name;

    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    @Override
    public int compareTo(Student s){
        return this.roll - s.roll;
    }

    @Override
    public String toString(){
        return roll + " - "+name;
    }
}


public class SortingUsingComparable {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();    

        list.add(new Student(0,"Karthik"));
        list.add(new Student(1,"Poojitha"));
        list.add(new Student(2,"Kalyan"));

        Collections.sort(list);


        for(Student s: list){
            System.out.println(s);
        }
    }
}
