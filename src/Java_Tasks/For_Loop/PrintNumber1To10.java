package Java_Tasks.For_Loop;
import java.util.Scanner;
public class PrintNumber1To10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

//        for(int i=1;i<=10;i++){
//
//            System.out.println(i);
//        }


        // Using User_Input
        System.out.println("Enter the number till where you want to print ");
        int number=sc.nextInt();

        for(int i=1;i<=number;i++){
            System.out.print(i+", ");
        }






sc.close();
    }
}
