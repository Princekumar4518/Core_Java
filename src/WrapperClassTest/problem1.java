package WrapperClassTest;
import java.util.Scanner;
// Write a custom exception called `InvalidAgeException` and throw it if age is less than 18.

//INPUT:
//20
//OUTPUT:
//Valid age: 20


//💡 Explanation:Age 20 is valid (>= 18)
//INPUT:
//15
//OUTPUT:
//InvalidAgeException: Age must be 18 or older
//💡 Explanation:Age 15 is invalid (< 18), so exception is thrown


public class problem1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age :");
        int age = sc.nextInt();


        if (age > 18) {
            System.out.println("Valid age :" + " " + age);
        } else {
            try {
                throw new CustomException("Invalid Age"+" "+age);
            } catch (CustomException e) {
                System.out.println("Invalid Age :"+" "+age);
            }
        }
    }
}

class CustomException extends Exception {
    CustomException(String msg) {
        super(msg);
    }
}


