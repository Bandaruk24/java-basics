package ExceptionHandling;

public class UncheckedExceptions {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int result=a/b;// Runtime Exception.
        System.out.println(result);
        String s = null;
        System.out.println(s); //Runtime error.
    }
}
