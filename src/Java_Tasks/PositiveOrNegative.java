


//  Check if a Number is Positive or Negative



package Java_Tasks;
import java.util.Scanner;
public class PositiveOrNegative {

    public static void main(String[] args) {
        // Check if a Number is Positive or Negative.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");


        if (sc.hasNextDouble()) {

            double number = sc.nextDouble();

            if (number > 0) {
                System.out.println(number + " " + "is a Positive Number");
            } else if (number < 0) {
                System.out.println(number + " " + "is a Negative Number");
            } else {
                System.out.println("This is a zero");
            }

        }
        else{
            System.out.println("Invalid input");
        }

          sc.close();  // closing scanner class
    }

}