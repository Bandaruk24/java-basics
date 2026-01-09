package ExceptionHandling;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        try{
            try (FileReader file = new FileReader("Sample.txt")) {
                file.read();
            }
        }
        catch(IOException e){
            System.out.println("File not found or error reading file");
        }
    }
}
