package oops;
public class Car {
    // Attributes of the Car class
    String color;
    String model;
    int year;

    // Method to display car details
    void displayDetails(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year);
    }
    // Constructor to initialize car attributes
    public Car(String model, String color, int year){
        this.model = model;
        this.color = color;
        this.year = year;
    }
    // Main method to create Car objects and display their details
    public static void main(String[] args){
        // Creating an object of the Car class
        Car car1 = new Car("Toyota", "Red", 2020);
        Car car2 = new Car("Honda", "Blue" ,2018);
        // Setting attributes of the car
        // Displaying car details
        car1.displayDetails();
        car2.displayDetails();
    }
}
