package FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateAndWriteToAFile {
    public static void main(String[] args) {
        try{
            // Step 1: Creating a File Object.
            File file = new File("example.txt");

            // Step 2: Creating a File.
            if(file.createNewFile()){
                System.out.println("File Created Successfully");
            }
            else{
                System.out.println("File already exists");
            }
            // Step 3: Write data to the file.
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, This is written using FIleWriter.");
            writer.write("Java File handling is easy!");

            writer.close();

            System.out.println("Data written to File successfully.");

        }
        catch(IOException e){
            System.out.println("Caught a Exception: "+e.getMessage());
        }
       
    }    
}
