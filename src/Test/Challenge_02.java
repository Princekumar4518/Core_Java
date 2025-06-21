package Test;

// Create a Java program that demonstrates various arithmetic and assignment operators.
// Input 10,5
// output Addition: 15 Subtraction: 5 Multiplication: 50 Division: 2 Modulus: 0
public class Challenge_02 {
    public static void main(String[] args) {

        int a=10;
        int b=5;
        int sum=a+b;
        int sub=a-b;
        int multiplication=a*b;
        int division=a/b;
        int modulus=a%b;

        System.out.println("Addition :"+" "+ sum);
        System.out.println("Subtraction :"+" "+ sub);
        System.out.println("Multiplication :"+" "+ multiplication);
        System.out.println("Division :"+" "+ division);
        System.out.println("Modulus :"+" "+ modulus);
    }
}
