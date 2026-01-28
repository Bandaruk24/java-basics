package java8features;

import java.util.*;
public class StreamAPI {
    public static void main(String[] args) {
        //Stream API (filter, map, reduce)
        List<Integer> numbers = Arrays.asList(1,2,3,4);

        //filter() selects elements based on a condition.
        System.out.println("Filter method output: ");
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);

        //map() transforms each element into another form.
        System.out.println("Reduce method output: ");
        numbers.stream().map(n->n*n).forEach(System.out::println);

        //reduce() combines all elements into a single result.
        int sum=numbers.stream().reduce(0,(a,b) -> a+b);
        System.out.println("Sum: "+sum);

        //Combined Example of (Filter + Reduce + Map):
        int result=numbers.stream().filter(n -> n % 2 == 0)
        .map(n -> n*n)
        .reduce(0, (a,b) -> a+b);
        System.out.println("Result: "+result);
        
        //Key Points to Remember ⭐
        // Stream does not modify original collection
        // Stream operations are lazy
        // filter & map are intermediate operations
        // reduce is a terminal operation
    }
}
