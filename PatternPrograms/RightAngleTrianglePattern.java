package PatternPrograms;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        int rows=5;
        //Pattern: Right Angle Triangle

        System.out.println("Right Angle Triangle Pattern:");
        for(int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
