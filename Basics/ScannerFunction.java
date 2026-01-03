import java.util.Scanner;
public class ScannerFunction {
    public static void main(String args[]){
        try{
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello, "+name+"!");
        sc.close();
        }catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
    }
}
}
