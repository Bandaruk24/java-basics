package ExceptionHandling;

public class MultipleCatchBlocks {
    public static void main(String[] args){
        try{
            int[] arr ={10, 20, 30};
            System.out.println(arr[5]/0);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception division by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of Bound Exception");
        }
    }
}
