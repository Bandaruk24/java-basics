package ExceptionHandling.ExceptionPropagation;

import java.io.IOException;

public class CheckedExceptionPropagation {
    void method1() throws IOException{
        throw new IOException("file error");
    }
    void method2() throws IOException{
        method1();
    }

    public static void main(String[] args) {
        try{
            new CheckedExceptionPropagation().method2();
        }
        catch(IOException e){
            System.out.println("Checked Exception handled in main");
        }
    }
}
