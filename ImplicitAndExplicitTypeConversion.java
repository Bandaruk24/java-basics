public class ImplicitAndExplicitTypeConversion {
    public static void main(String[] args) {
        // Implicit Type Conversion (Widening)
        int intVar = 100;
        double doubleVar = intVar; // int to double
        System.out.println("Implicit Type Conversion:");
        System.out.println("Integer value: " + intVar);
        System.out.println("Converted to Double: " + doubleVar);

        // Explicit Type Conversion (Narrowing)
        double anotherDoubleVar = 9.78;
        int anotherIntVar = (int) anotherDoubleVar; // double to int
        System.out.println("\nExplicit Type Conversion:");
        System.out.println("Double value: " + anotherDoubleVar);
        System.out.println("Converted to Integer: " + anotherIntVar);

        long LongVar = 50000L;
        float floatVar = (float) LongVar;
        System.out.println("\nExplicit Type Conversion from Long to Float:");
        System.out.println("Long value: " + LongVar);   
        System.out.println("Converted to Float: " + floatVar);
        
        int intVar1 = 65;
        char charVar = (char) intVar1; // int to char
        System.out.println("\nExplicit Type Conversion from Int to Char:");
        System.out.println("Integer value: " + intVar1);
        System.out.println("Converted to Char: " + charVar);

    }
}
