package JumpStatements;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==6){
                break; // Exit the loop when i is 6
            }
            System.out.println("Value of i: "+i);
        }
    }
}
