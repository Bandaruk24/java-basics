package Arrays;

public class SortingBubbleSort {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};
        int n = numbers.length;
        // Printing original array
        System.out.println("Original array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        // Bubble Sort Algorithm

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(numbers[j]>numbers[j+1]){
                    // Swaping elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }

        // Printing sorted array
        System.out.println("Sorted array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
