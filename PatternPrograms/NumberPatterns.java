package PatternPrograms;

public class NumberPatterns {
    public static void main(String[] args){
        int rows=5;
        //Pattern: Number Pyramid Pattern
        System.out.println("Number Pyramid Pattern:");
        for(int i=1;i<=rows;i++){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(i);
            }
            System.out.println();   
        }

        //Pattern: Inverted Number Pyramid Pattern
        System.out.println("Inverted Number Pyramid Pattern:");
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(i);
            }
            System.out.println();
        }
        //Pattern: Number Square Pattern
        System.out.println("Number Square Pattern:");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
