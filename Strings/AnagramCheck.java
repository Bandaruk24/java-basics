package Strings;
import java.util.Arrays;
public class AnagramCheck {
    public static void main(String[] args){
        String str1= "Listen";
        String str2 = "Silent";

        // Converting both the Strings to lower case to make comparison case insensitive
        str1 =str1.toLowerCase();
        str2 = str2.toLowerCase();
        // Removing all white spaces from the Strings
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s", "");

        // Checking if lengths are equal
        if(str1.length() != str2.length()){
            System.out.println("The strings are not anagrams.");

        }
        else{
            // Converting Strings to character Arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            //Sorting the character Arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Comparing the sorted character Arrays
            if(Arrays.equals(charArray1, charArray2)){
                System.out.println("The strings are anagrams.");
            }
            else{
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}
