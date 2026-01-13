import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.sampled.Line;

public class CountLinesAndWordsInFile {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        
        try(BufferedReader br = new BufferedReader( new FileReader("example.txt"))){
            String line;

            while((line = br.readLine())!=null){
                lineCount++;
                // Split line into words
                String[] word = line.trim().split("\\s+");
                wordCount+=word.length;
            }
            System.out.println("Number of lines: "+ lineCount);
            System.out.println("Number of Words: "+ wordCount);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
