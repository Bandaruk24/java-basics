package ExceptionHandling;

public class FinallyBlock {
    public static void main(String[] args) {
        try{
            int a=10/2;
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("Exception Handled");
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
}
