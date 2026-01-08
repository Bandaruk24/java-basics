package Abstraction;
//Abstraction is used when we interact with an object through an interface reference instead of its concrete class, which hides implementation details and exposes only the functionality
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start(){
        System.out.println("Car Starts.");
    }
    public void stop(){
        System.out.println("Car Stops");
    }
}

public class AbstractionUsingInterface{
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Abstraction
        vehicle.start();
        vehicle.stop(); 
    }
}