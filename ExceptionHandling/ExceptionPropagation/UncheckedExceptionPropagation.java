package ExceptionHandling.ExceptionPropagation;

public class UncheckedExceptionPropagation {
    void method1(){
        int data = 10/0; // Exception occurs here
    }
    void method2(){
        method1(); // Exception propagates here
    }
    void method3(){
        try{
            method2();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception: "+e.getMessage());
        }
    }
    public static void main(String[] args) {
        UncheckedExceptionPropagation obj = new UncheckedExceptionPropagation();
        obj.method3();
        System.out.println("Program continues normally");
    }
}
