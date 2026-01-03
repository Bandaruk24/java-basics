public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a=10;
        int b=5;
        System.out.println("Addition: " + (a + b)); // 15
        System.out.println("Subtraction: " + (a - b)); // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b)); // 2
        System.out.println("Modulus: " + (a % b)); // 0

        //Relational Operators
        System.out.println("Equal to : "+(a==b)); // false
        System.out.println("Not Equal to : "+(a!=b)); // true   
        System.out.println("Greater than : "+(a>b)); // true
        System.out.println("Less than : "+(a<b)); // false
        System.out.println("Greater than or Equal to : "+(a>=b)); // true
        System.out.println("Less than or Equal to : "+(a<=b)); // false

        //Logical Operators
        boolean x=true;
        boolean y=false;
        System.out.println("Logical AND : "+(x && y)); // false
        System.out.println("Logical OR : "+(x || y)); // true
        System.out.println("Logical NOT : "+(!x)); // false
        System.out.println("Logical NOT :"+(!y)); // true

        //Bitwise Operators
        int p=6; // 110 in binary
        int q=3; // 011 in binary
        int r=0; 
        System.out.println("Bitwise AND : "+(p & q)); // 2 (010 in binary)
        System.out.println("Bitwise OR : "+(p | q)); // 7 (111 in binary)
        System.out.println("Bitwise XOR : "+(p ^ q)); // 5 (101 in binary)
        System.out.println("Bitwise NOT : "+(~p)); // -7 (in binary: ...11111001) 
        System.out.println("Bitwise XOR : "+(q ^ r)); // 3 (011 in binary)
        System.out.println("Left Shift : "+(p << 1)); // 12 (1100 in binary)
        System.out.println("Right Shift : "+(p >> 1)); // 3 (011 in binary)
        

        //Assignment Operators
        int c=10;
        c+=5; // c = c + 5
        System.out.println("Addition Assignment: " + c); // 15
        c-=3; // c = c - 3
        System.out.println("Subtraction Assignment: " + c); // 12
        c*=2; // c = c * 2
        System.out.println("Multiplication Assignment: " + c); // 24
        c/=4; // c = c / 4
        System.out.println("Division Assignment: " + c); // 6
        c%=4; // c = c % 4
        System.out.println("Modulus Assignment: " + c); // 2

        //Ternary Operator
        int age=20;
        String eligibility=(age>=18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println("Ternary Operator: " + eligibility); // Eligible to vote
    }
}
