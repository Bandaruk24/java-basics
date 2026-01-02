public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        // Using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swapping: a = " + a + ", b = " + b);

        // Swapping without a temporary variable
        a = 10;
        b = 20;
        a = a + b; // a now becomes 30
        b = a - b; // b becomes 10
        a = a - b; // a becomes 20
        System.out.println("After Swapping without temp variable: a = " + a + ", b = " + b);

        // Swapping using XOR bitwise operator
        a = 10;
        b = 20;
        a = a ^ b; // a now becomes 30 (in binary 11110)
        b = a ^ b; // b becomes 10
        a = a ^ b; // a becomes 20
        System.out.println("After Swapping using XOR: a = " + a + ", b = " + b);
    }
}
