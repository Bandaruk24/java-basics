import java.io.FileReader;
import java.io.IOException;

class ReadFileUsingFileReader{
    public static void main(String[] args) {
        try{
        FileReader reader = new FileReader("example.txt");
        int ch;
        while(( ch = reader.read()) != -1){
            System.out.print((char) ch);
        }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}