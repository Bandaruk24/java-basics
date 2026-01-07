package oops;

public class Constructors {
    // Attribute of the class
    private String message;
    // Constructor to initialize the attribute
    public Constructors(String msg){
        message = msg;
    }
    public void display(){
        System.out.println(message);
    }
    public static void main(String[] args){
        // Creating an object of the Constructors class
        Constructors obj = new Constructors("Custom Message");
        // Calling the display method
        obj.display();
    }
}
