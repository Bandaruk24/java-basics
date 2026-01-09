package oops;
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    int roll;

    Student(String name, int roll) {
        super(name);
        this.roll = roll;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + roll);
    }
}

public class ThisAndSuperKeywords {
    public static void main(String[] args) {
        Student student = new Student("Karthik", 21);
        student.display();
    }
}
