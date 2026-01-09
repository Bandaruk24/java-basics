package ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        try{
            int a=10;
            int b=0;
            System.out.println("Division : "+(a/b));
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception division by Zero.");
        }
    }
}
