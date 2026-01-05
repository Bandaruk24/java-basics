package Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Original Array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        } 
        // Reversing the array
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            // Swap elements
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }
        // Printing the reversed array
        System.out.println("\nReversed Array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
