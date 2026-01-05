package LoopingStatements;
import java.util.Scanner;
public class ForLoopExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n= scanner.nextInt();

        System.out.println("First " + n + " natural numbers are:");
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
        scanner.close();
    }
}
