package Java_Tasks.while_Loop;
import java.util.Scanner;


public class Table {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which table you print ");
        int number = sc.nextInt();

        int i=1;
        while(i<=10){
            System.out.println(number+"x"+i+"="+(number*i));
            i++;
        }


        sc.close();
    }
}