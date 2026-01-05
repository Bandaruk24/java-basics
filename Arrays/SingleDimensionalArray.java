package Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        //Declaring and initializing a single-dimensional array
        int[] numbers = {10, 20, 30, 40, 50};
        //Accessing and printing elements of the array
        for(int i=0;i<numbers.length;i++){
            System.out.println("Element at index "+i+": "+numbers[i]);
        }
    }
}
