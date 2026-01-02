package JumpStatements;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==6){
                continue; // Skip the iteration when i is 6
            }
            System.out.println("Value of i: "+i);
        }
    }
}
