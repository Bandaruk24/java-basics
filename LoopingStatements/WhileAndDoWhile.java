package controlStatements;

public class WhileAndDoWhile {
    public static void main(String[] args){
        int count=1;
        //While Loop
        while(count<=5){
            System.out.println("While Loop Count: "+count);
            count++;   
        }

        System.out.println("---------------");
        //Do-While Loop

        int doCount=1;
        do{
            System.out.println("Do-While Loop Count: "+doCount);
            doCount++;
        }
        while(doCount<=5);
        
    }
    
}
