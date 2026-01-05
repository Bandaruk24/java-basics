package Arrays;

public class LargestAndSmallestElement {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {45, 22, 89, 11, 67, 34};
        int largest = numbers[0];
        int smallest = numbers[0];
        // Finding largest and smallest elements}
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest = numbers[i];
            }
            else if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        // Printing largest and smallest elements
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        
    }
}
