import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
    public static void main(String[] args) {
        // buffer Copies multiple bytes at once. Faster and used in real projects.
        try(
            FileInputStream fis = new FileInputStream("example.txt");
            FileOutputStream fos = new FileOutputStream("destination.txt");
        ){
            byte[] buffer = new byte[1024];
            int byteRead;
            while ((byteRead = fis.read(buffer))!=-1) {
                fos.write(buffer, 0, byteRead);
            }
            System.out.println("File Copied Successfully.");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
