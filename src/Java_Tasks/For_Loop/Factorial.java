package Java_Tasks.For_Loop;

// Calculate the factorial of a number using a for loop:

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for calculating factorial...........");
        int number;
        int factorial=1;
        if (sc.hasNextInt()) {
            number = sc.nextInt();

            if (number < 0) {
                System.out.println("Factorial of -ve numbers are udefined");
                return;
            } else if (number == 0) {
                System.out.println("Factorial of 0 is 1");
            }
            else {

                for(int i=1;i<=number;i++){
                    factorial*=i;
                }
                System.out.println("Factorial of"+" "+number+" "+"is"+" ="+" "+factorial);


            }

        }
        else{
            System.out.println("Invalid Input");
        }

    }
}
