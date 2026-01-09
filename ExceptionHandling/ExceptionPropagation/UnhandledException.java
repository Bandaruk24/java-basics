package ExceptionHandling.ExceptionPropagation;

public class UnhandledException {
    void method1(){
        int data = 10/0;
    }
    void method2(){
        method1();
    }
    public static void main(String[] args) {
        UnhandledException obj = new UnhandledException();
        obj.method2();
    }
}
