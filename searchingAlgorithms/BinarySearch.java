package searchingAlgorithms;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        // Declaring and initializing a sorted array
        Scanner scanner = new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<5;i++){
            System.out.println("Enter element "+(i+1)+": ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Enter the target element to search: ");
        int target = scanner.nextInt();
        int index = binarySearch(arr, target);

        if(index != -1){
            System.out.println("Element found at index: " + index);
        }
        else{
            System.out.println("Element not found in the array");
        }
        scanner.close();
    }

    static int binarySearch(int[] arr,int target){
        int low =0;
        int high=arr.length - 1;

        while(low <= high){
            int mid= (low+high)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}