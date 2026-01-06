package Strings;

public class StringClass {
    public static void main(String[] args){
        // Creating a string
        String str = "Hello, Github!";
        String str1=new String("Hello, Github!");
        // Comparing two strings (Address Comparison)
        System.out.println("Comparing Strings: " + (str==str1));
        // Using equals() method to compare strings (Content Comparison)
        System.out.println("Comparing Strings: "+str.equals(str1));
        // Printing the string to the console
        System.out.println(str);
        // Finding the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        // Converting the string to uppercase
        String upperStr = str.toUpperCase();
        System.out.println("UpperCase String: "+upperStr);
        // Converting the string to lowercase
        String lowerCase = str.toLowerCase();
        System.out.println("LowerCase String: "+lowerCase);
        // Extracting a substring
        String subStr = str.substring(7,13);
        System.out.println("Substring: " + subStr);
        // Replacing characters in the string
        String replacedString = str.replace("World","Java");
        System.out.println("Replaced String: "+replacedString);
    }
}
