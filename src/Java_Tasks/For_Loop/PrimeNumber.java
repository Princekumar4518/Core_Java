package Java_Tasks.For_Loop;

// Check if a Number is Prime

import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for checking Prime or not ........???");
        int number;
        int count=0;

        if (sc.hasNextInt()) {
            number = sc.nextInt();

            for (int i = 2; i <= number-1; i++) {
                if (number % i == 0) {
                    count+=1;
                }
            }
            if (count > 0) {
                System.out.println(number + " " + "is not a Prime number");
            } else {
                System.out.println(number + " " + "is a Prime number");
            }
        }

        else{
            System.out.println("Invalid Input");
        }


sc.close();


    }
}
