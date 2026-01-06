package Strings;

public class StringBuilderAndStringBuffer {
    public static void main(String[] args){
        // We use StringBuilder and StringBuffer for mutable strings
        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", StringBuilder!");
        System.out.println("StringBuilder: "+sb);
        // StringBuilder is not synchronized, so it's faster but not thread-safe.

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(", StringBuffer!");
        System.out.println("StringBuffer: "+sbf);
        // StringBuffer is synchronized, so it's thread-safe but slower.
    }
}
