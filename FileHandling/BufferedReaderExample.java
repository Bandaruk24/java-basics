import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try{
            // BufferedReader is used to read line by line rather than character by character.BufferReader is fast compared to FileReader and reads line by line.
            BufferedReader br = new BufferedReader(new FileReader("example.txt"));
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
