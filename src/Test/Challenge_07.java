package Test;
// Create a program to find the largest among three numbers using if-else statements.
public class Challenge_07 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 10;
        int num3 = 8;

        if((num1>num2 && num1>num3) || (num1==num2 && num1>num3 ) ) {
            System.out.println(num1+" "+"is Largest number");
        } else if (num2>num3 && num2>num1|| (num2==num3 && num2>num1 )) {
            System.out.println(num2+" "+"is Largest number");
        }
        else {
            System.out.println(num3+" "+"is a Largest number");
        }
    }
}
