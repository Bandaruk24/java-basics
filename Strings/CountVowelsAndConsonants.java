package Strings;
import java.util.Scanner;
public class CountVowelsAndConsonants {
    public static void main(String[] args){
        // Original String
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        scanner.close();
        int vowelsCount = 0;
        int consonantsCount = 0;
        // Converting the string to lowercase to make the check case-insensitive
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelsCount++;
            }
            else if(ch>='a' && ch<='z'){
                consonantsCount++;
            }
        }
        System.out.println("Numbers of Vowels: "+vowelsCount);
        System.out.println("Number of Consonants: "+consonantsCount);
    }
}
