package controlStatements;

import java.util.Scanner;
class IfElse{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int number = scanner.nextInt();

        if (number > 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }
        scanner.close();
    }
}