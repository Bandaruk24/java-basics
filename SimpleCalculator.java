import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble(); 

        double result;
        switch(operation){
            case "+":
                result = num1 + num2;
                System.out.println("Result: "+result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("Result: "+result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("Result: "+result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println("Result: "+result);
                break;
            default :
                System.out.println("Invalid Operation");
                break;
        }
        scanner.close();
        
    }
}
