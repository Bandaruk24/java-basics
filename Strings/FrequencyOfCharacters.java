package Strings;

public class FrequencyOfCharacters {
    public static void main(String[] args){
        String str = "programming";
        int[] freq = new int[256]; // Assuming ASCII character set
        // Calculating frequency of each character
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)]++;
        }
        // Printing frequency of each character
        System.out.println("Character frequencies in the string \"" + str + "\":");
        for(int i=0;i<256;i++){
            if(freq[i]>0){
                System.out.print((char)i + ": " + freq[i]+" ");
            }
        }
    }
}
