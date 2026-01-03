package PatternPrograms;

public class DiamondPattern {
    public static void main(String[] args) {
        int rows=5;
        //Pattern: Diamond Pattern
        System.out.println("Diamond Pattern:");
        for(int i=1;i<=rows;i++){
            for(int j=rows;i<j;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
