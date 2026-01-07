package Strings;

public class CountWordsInASentence {
    public static void main(String[] args){
        // Original String
        String str = "Hello, Viewers! Welcome to the world of java programming.";
        // Splitting the string based on spaces to get individual words
        String[] words = str.split(" ");
        // Counting the number of words
        int wordCount = words.length;
        System.out.println("Number of words in the sentence: "+wordCount);

        // Printing each word
        System.out.println("The words in the sentence are:");
        for(String word : words){
            System.out.println(word);
        }
        
    }
}
