package Java_Tasks._23June;
import java.util.Scanner;
public class daysMonthYear {
    public static void main(String[] args) {


        int year = 0;
        int month = 0;
        int day = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days .......... ");
        int days;
        if (!sc.hasNextInt() ) {

            System.out.println("Enter only Positive integers");
            sc.next();
        }
        else {
             days=sc.nextInt();

            if (days >= 365) {
                year = days / 365;           //Calculate years
                int remaningDays = days % 365;   //Remaining days

                month = remaningDays / 30;      //Calculate months
                day = remaningDays % 30;        //Remaining days
                System.out.println(year + " years " + "," + month + " months " + "," + day + " days ");
            } else if (days >= 0 && days < 365) {
                month = days / 30;
                int rem_days = days % 30;

                day = rem_days % 30;

                System.out.println(year + " years " + "," + month + " months " + "," + day + " days ");
            } else {
                System.out.println("Days must be a positive number");
            }
            sc.close();
        }
    }

}