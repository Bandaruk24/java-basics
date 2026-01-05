package Arrays;

import javax.sound.sampled.Line;

public class LinearSearch {
    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers= {15, 25, 35, 45, 55};
        int target = 35;
        int index = linearSearch(numbers, target);
        

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found in the array");
        }
    }

static int linearSearch(int[] arr,int target){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            return i;
        }
    }
    return -1;
    }  
}