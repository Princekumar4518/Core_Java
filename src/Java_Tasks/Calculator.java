package Java_Tasks;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println( "Welcome to Calculator Program ................");


        double number1;
        double number2;



        System.out.print("Enter the First number: ");
        if (sc.hasNextDouble()) {
            number1 = sc.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.close();
            return;
        }

        System.out.print("Enter the Second number: ");
        if (sc.hasNextDouble()) {
            number2 = sc.nextDouble();
        } else {
            System.out.println("Invalid input! Please enter a valid number.");
            sc.close();
            return;
        }

        System.out.print("Enter the operator (+, -, *, /, %): ");
        String sign = sc.next();

        switch (sign) {
            case "+":
                System.out.println("Sum: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Subtraction: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Mathematical Exception: Cannot divide by zero.");
                } else {
                    System.out.println("Division: " + (number1 / number2));
                }
                break;
            case "%":
                System.out.println("Modulus: " + (number1 % number2));
                break;
            default:
                System.out.println("Invalid operator! Please enter one of +, -, *, /, %.");
        }

        sc.close();
    }
}

