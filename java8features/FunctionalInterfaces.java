package java8features;
//A functional interface is an interface with a single abstract method that enables lambda expressions in Java.

import java.util.function.Predicate;

@FunctionalInterface
interface Calculate {
    int calculate(int a,int b);
    //Functional interface can have any number of default methods
    default void info(){
        System.out.println("Method to calculate values.");
    }
}
public class FunctionalInterfaces {
    public static void main(String[] args) {
        Calculate c=(a,b)->a+b;
        Calculate c1=(a,b)->a*b;
        c.info();
        System.out.println(c.calculate(2, 3));
        System.out.println(c1.calculate(2, 3));
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(4));
    }
}
