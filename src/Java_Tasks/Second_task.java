

//Check if a Number is Even or Odd.

package Java_Tasks;
import java.util.Scanner;
public class Second_task {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int number=sc.nextInt();


           if(number==0){
               System.out.println(number+" " +"is a Even Number");
           }
            else if(number%2==0 ){
                System.out.println(number+" " +"is a Even Number");
            }
            else {
                System.out.println(number+" " +"is a Odd Number");
            }
        }


    }

