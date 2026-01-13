import java.io.FileReader;
import java.io.IOException;

class ReadFileUsingFileReader{
    public static void main(String[] args) {
        // FileReader is a character stream class in Java used to read text files.
        try{
            // Creating a FileReader Object and Opens the file for reading..
            FileReader reader = new FileReader("example.txt");
            // initializing a char.
            int ch;
            // reader.read() - Reads one character at a time Returns: Character ASCII value 
            // -1 → End of file (EOF)
            while(( ch = reader.read()) != -1){
                // (char) ch : Converts ASCII value into character
                System.out.print((char) ch);
            }
            // Releases system resources (must do)
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}