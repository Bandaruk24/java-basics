package Strings;

public class RemoveSpecialCharacters {
    public static void main(String[] args){
        // Original String with special characters
        String str = "Hello@World! Welcome#to$Java%Programming^";
        // Removing special characters using regex
        String cleanString = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Original String: " + str);
        System.out.println("String after removing special characters: " + cleanString);
    }
}
