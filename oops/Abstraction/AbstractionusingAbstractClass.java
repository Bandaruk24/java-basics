package Abstraction;

public class AbstractionusingAbstractClass {
    // Abstract Class
    abstract static class Animal{
        // Abstract method (no body)
        abstract  void sound();

        // Concrete Method 
        void eat(){
            System.out.println("Animal eat Food.");
        } 
    }

    // Child class
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog barks");
        }
    }
    public static void main(String[] args){
        // Animal is abstract → cannot create object
        Animal animal = new Dog();
        animal.sound();
        animal.eat();
    }
}
