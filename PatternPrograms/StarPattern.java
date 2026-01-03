package PatternPrograms;

public class StarPattern {
    public static void main(String[] args) {
        int rows=5;

        //Pattern 1: Star Square
        System.out.println("Pattern 1: Star Square");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println();


    }
}
