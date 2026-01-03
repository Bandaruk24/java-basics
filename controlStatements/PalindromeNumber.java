package controlStatements;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number to check if it is a Palindrome: ");
        int num=scanner.nextInt();
        int reverse=0,temp;
        temp=num;
        while(temp!=0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        if(num==reverse){
            System.out.println(num+" is a Palindrome Number");
        } else {
            System.out.println(num+" is not a Palindrome Number");
        }
        scanner.close();
    }
}
