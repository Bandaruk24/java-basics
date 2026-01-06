package Strings;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args){
        // Original string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String str=scanner.nextLine();
        scanner.close();
        // Converting string to lowercase to ensure case insensitivity
        String cleanedString = str.toLowerCase();
        // Reversing the string
        String reversedString = "";
        for(int i=cleanedString.length()-1;i>=0;i--){
            reversedString+=cleanedString.charAt(i);
        }
        // Checking if the original string is equal to the reversed string
        if(cleanedString.equals(reversedString)){
            System.out.println(str+" is a palindrome.");
        }
        else{
            System.out.println(str+" is not a palindrome.");
        }
    }   
}
