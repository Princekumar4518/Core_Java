package Java_Tasks.For_Loop;

// Print Numbers from 10 to 1 (Reverse Order)
import java.util.Scanner;

public class ReverseOrder {
    public static void main(String[] args) {

//        System.out.println("Numbers in Reverse Order are.........");
//        for (int i=10;i>0;--i){
//            System.out.println(i);
//        }



        // Using user input  and while loop
  Scanner sc=new Scanner(System.in);
  int number;
        System.out.print("Enter a positive number for reverse order: ");
        if (sc.hasNextInt()) {
            number = sc.nextInt();

            if (number > 0) {
                System.out.println("Numbers in Reverse Order:");
                while (number > 0) {
                    System.out.println(number);
                    number--;
                }
            } else {
                System.out.println("Please enter a positive integer greater than 0.");
            }
        } else {
            System.out.println("Invalid input. Please enter only positive integers.");
        }
        sc.close();

    }
}
