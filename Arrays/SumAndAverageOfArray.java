package Arrays;

public class SumAndAverageOfArray {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};
        int sum=0;
        // Calculating sum of array elements
        for(int i=0;i<numbers.length;i++){
            sum+=numbers[i];
        }
        // Calculating average
        double average = sum / (double) numbers.length;
        // Printing sum and average
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
