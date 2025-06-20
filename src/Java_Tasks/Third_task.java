
//  Find the Maximum of Two Numbers.
package Java_Tasks;
import java.util.Scanner;
public class Third_task {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Numbers :");

        System.out.println("First number is = ");
        double first_num=sc.nextDouble();

        System.out.println("Second number is = ");
        double Second_num=sc.nextDouble();

         if(first_num==Second_num){
             System.out.println("Both are equal numbers");
         }

          else if(first_num>Second_num){
            System.out.println(first_num+" " +"is a Maximum Number");
        }
        else{
            System.out.println(Second_num+" " +"is a Maximum Number");
        }
    }
}

