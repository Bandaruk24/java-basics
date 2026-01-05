package Arrays;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args){
        // Declaring an array with duplicates
        int[] numbers = {10,20,10,30,40,20,50,30};
        int n=numbers.length;
        System.out.println(n);
        int[] temp = new int[n];
        // sorting the array Manually
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[i]>numbers[j]){
                    int t=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=t;
                }
            }
        }
        // Sorting the array using Array.sort() method(Optional)
        //Arrays.sort(numbers);

        // Printing sorted array
        System.out.println("Sorted array:");
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        // Removing duplicates
        int j=0;
        for(int i=0;i<n-1;i++){
            if(numbers[i]!=numbers[i+1]){
                temp[j++]=numbers[i];
            }
        }
        temp[j++]=numbers[n-1];
        // Printing array after removing duplicates
        System.out.println("Array after removing duplicates:");
        for(int i=0;i<j;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
