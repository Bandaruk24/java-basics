public class Polymorphism {
    //Runtime Polymorphism Method Overriding
    static class Animal{
        void sound(){
            System.out.println("Animal makes a sound");
        }
    }  
    static class Cat extends Animal{
        @Override
        void sound(){
            System.out.println("Cat meows");
        }
    }
    static class Dog extends Animal{
        @Override
        void sound(){
            System.out.println("Dog barks");
        }
    }
    //Compile Time Polymorphism Method Overloading
    
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a + b;
    }

    public static void main(String[] args){
        // Creating objects of the classes
        Animal myAnimal = new Animal(); // Animal reference and object
        Animal myCat = new Cat(); // Animal reference but Cat object
        Animal myDog = new Dog(); // Animal reference but Dog object

        // Creating object of the Calculator Class
        Polymorphism cal = new Polymorphism();
        System.out.println("Method Overloading: ");
        System.out.println("Addition of Two Integers: "+cal.add(1,3));
        System.out.println("Addition of Three Integers: "+cal.add(1,2,3));
        System.out.println("Addition of Two Doubles: "+cal.add(2.5, 3.5));

        // Calling the sound method on each object
        System.out.println("Method Overriding: ");
        myAnimal.sound(); // Outputs: Animal makes a sound
        myCat.sound();   // Outputs: Cat meows
        myDog.sound();   // Outputs: Dog barks
    }
}
