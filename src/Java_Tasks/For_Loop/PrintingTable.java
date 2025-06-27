package Java_Tasks.For_Loop;

//  Multiplication Table of a Given Number (take the input from user).
import java.util.Scanner;
public class PrintingTable {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number which you want to print Table........");
        int number;
        if(sc.hasNextInt()){
            number=sc.nextInt();

            if(number<=0){
                System.out.println("Enter number greater than Zero");
                return;
            }
            else{

                System.out.println("Table of "+" "+number +" "+"is.....");

                for(int i=1;i<=10;i++){
                    System.out.println(number+" "+"x"+" "+i+" "+"="+" "+number*i);
                }

            }
        }
        else{
            System.out.println("Please enter a number only");
            return;
        }
        sc.close();
    }
}