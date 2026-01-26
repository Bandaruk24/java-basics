package java8features;

import java.util.*;

//A lambda expression is a shorter way to write an implementation of a functional interface.
@FunctionalInterface
interface  Calculator {
    int calculate(int a,int b);
}
public class LambdaExpressions {
    public static void main(String[] args) {
        Calculator c = (a,b) -> a+b;
        Calculator c1 = (a,b) -> a*b;
        System.out.println("Addition of Numbers: "+c.calculate(1,2));
        System.out.println("Multiplication of Numbers: "+c1.calculate(2,3));

        //List Creation using lambda functions
        List<String> names = Arrays.asList("Karthik","Kumar","Bandaru");
        names.forEach(name->System.out.println(name));
        //Sorting the elements based on the alphabetic order.
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    };
}
