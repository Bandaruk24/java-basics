public class Inheritance {
    // Base class
    static class Animal {
        void eat(){
            System.out.println("This animal eats food.");
        }
    }
    // Derived class
    static class Dog extends Animal {
        void bark(){
            System.out.println("The dog barks.");
        }
    }

    // Main method to demonstrate inheritance
    public static void main(String[] args){
        // Creating an object of the Dog class
        Dog dog = new Dog();
        // Calling methods from both the base and derived class
        dog.eat();
        dog.bark();
        
    }
}