package PatternPrograms;

public class StarPatterns {
    public static void main(String[] args) {
        int rows=5;

        //Pattern 1: Right Angled Triangle
        System.out.println("Pattern 1: Right Angled Triangle");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println();

        //Pattern 2: Inverted Right Angled Triangle
        System.out.println("Pattern 2: Inverted Right Angled Triangle");
        for(int i=rows;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //Pattern 3: Pyramid
        System.out.println("Pattern 3: Pyramid");
        for(int i=1;i<=rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        //Pattern 4: Inverted Pyramid
        System.out.println("Pattern 4: Inverted Pyramid");
        for(int i=rows;i>=1;i--){
            for(int j=rows;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}
