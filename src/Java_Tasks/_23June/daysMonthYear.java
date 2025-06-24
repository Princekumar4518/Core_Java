package Java_Tasks._23June;
import java.util.Scanner;
public class daysMonthYear {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Days");
        int totaldays;


        if(sc.hasNextInt()){
            totaldays=sc.nextInt();


            int year=totaldays/365;

            int leftDays=totaldays%365;

            int month=leftDays/30;
            int days=leftDays%30;

            if(year>0 ){
                System.out.println(year+" "+"Year"+" "+month+" "+"Month"+" "+days+" "+"Days");
            }
            else if(month>0){
                System.out.println(month+" "+"Month"+" "+days+" "+"Days");
            }
            else{
                System.out.println(days+" "+"Days");
            }

        }


    }
}
