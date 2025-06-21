package Test;
// Create a program to calculate factorial of a number using while loop.
public class Challenge_12 {
    public static void main(String[] args) {


        int number = -8;
        int i = 1;
        int factorial = 1;
        if (number == 0) {
            System.out.println("Factorial of" + " " + number+" " + "is = 1");
        } else if (number < 0) {
            System.out.println("Factorial of Negative numbers does not exist");
        } else {
            while (i <= number) {

                factorial *= i;
                i++;
            }
            System.out.println("Factorial of" + " " + number +" "+ "is = " + " " + factorial);
        }
    }
}