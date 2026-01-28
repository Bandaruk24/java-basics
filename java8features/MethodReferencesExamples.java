package java8features;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//A method reference is a shorter and 
// cleaner way to refer to an existing method
// using :: instead of writing a lambda expression.

class MathUtils{
    static void printSquares(int n){
        System.out.println(n*n);
    }
}

class Printer{
    void print(String msg){
        System.out.println(msg);
    }
}

class Student{
    String name;
    Student(String name){
        this.name=name;
    }
}
public class MethodReferencesExamples {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        //Reference to a Static Method
        list.forEach(MathUtils::printSquares);

        //Reference to an Instance Method of a Particular Object
        Printer printer=new Printer();
        List<String> names = Arrays.asList("Karthik","java");
        names.forEach(printer::print);

        //Reference to an Instance Method of an Arbitrary Object of a Class
        names.stream().map(String::toUpperCase).forEach(System.out::println);

        //Reference to a Constructor
        //Student::new -> name -> new Student(name)
        List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());

        System.out.println("List Size: "+students.size());
    }
}
