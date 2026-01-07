package Strings;

public class ReverseAString {
    static String reverseRecursively(String str){
        if(str.isEmpty()){
            return str;
        }
        return str.charAt(str.length()-1) + reverseRecursively(str.substring(0,str.length()-1));
    }
    public static void main(String[] args){
        // Original String
        String str="Hello, World!";

        // Method 1: Using loops
        String reversedString1 = "";
        for(int i =str.length()-1;i>=0;i--){
            reversedString1+=str.charAt(i);
        } 
        System.out.println("Reversed String using loops: "+reversedString1);

        //Method 2: Using StringBuilder
        StringBuilder sb= new StringBuilder("Hello, World!");
        String reversedString2 = sb.reverse().toString();
        System.out.println("Reversed String using StringBuilder: "+reversedString2);
        
        // Method 3: Using char array (Best for performance)
        char[] charArray = str.toCharArray();
        int left=0;
        int right=charArray.length-1;
        while(left<right){
            // Swapping characters
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        
        String reversedString3 = new String(charArray);
        System.out.println("Reversed String using char array: "+reversedString3);

        // Method 4: Using recursion
        String reversedString4 = reverseRecursively(str);
        System.out.println("Reversed String using recursion: "+reversedString4);
    }
}
