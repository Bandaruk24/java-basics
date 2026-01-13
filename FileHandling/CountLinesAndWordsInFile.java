import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.sampled.Line;

public class CountLinesAndWordsInFile {
    public static void main(String[] args) {
        // Variables to store totals
        int lineCount = 0;
        int wordCount = 0;
        
        try(BufferedReader br = new BufferedReader( new FileReader("example.txt"))){
            String line;
            // Reads one line at a time
            // null → End of file
            while ((line = br.readLine()) != null) {
            // Each readLine() means one line
            lineCount++;

            line = line.trim();
            // If file contains empty lines, avoid counting them as words:
            if (!line.isEmpty()) {
                // trim() → removes extra spaces
                // \\s+ → splits by one or more spaces
                // words.length → number of words in that line
            wordCount += line.split("\\s+").length;
            }
        }
            // Printing the lines and words. 
            System.out.println("Number of lines: "+ lineCount);
            System.out.println("Number of Words: "+ wordCount);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }    
}
