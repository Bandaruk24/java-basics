package PatternPrograms;

public class AlphabetPatterns {
    public static void main(String[] args){
        int rows=5;
        //Pattern: Alphabet 'A'
        System.out.println("Alphabet 'A' Pattern:");
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if((j==1 || j==rows) && i!=1 || i==1 && j>1 && j<rows || i==rows/2+1){
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Pattern: Alphabet 'B'
        System.out.println("Alphabet 'B' Pattern:");        
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(j==1 || (i==1 || i==rows/2+1 || i==rows) && j<rows || j==rows && i!=1 && i!=rows/2+1 && i!=rows){
                    System.out.print("B");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //Pattern: Alphabet 'C'
        System.out.println("Alphabet 'C' Pattern:");  
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=rows;j++){
                if(j==1 && i!=1 && i!=rows || (i==1 || i==rows) && j>1){
                    System.out.print("C");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }              
    }
}
