package java8features;

import java.util.*;

//A lambda expression is a shorter way to write an implementation of a functional interface.

public class LambdaExpressions {
    public static void main(String[] args) {
        //List Creation using lambda functions
        List<String> names = Arrays.asList("Karthik","Kumar","Bandaru");
        names.forEach(name->System.out.println(name));
        //Sorting the elements based on the alphabetic order.
        Collections.sort(names, (a, b) -> a.compareTo(b));
        System.out.println(names);
    };
}
