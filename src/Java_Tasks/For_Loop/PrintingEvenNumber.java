package Java_Tasks.For_Loop;
import java.util.Scanner;
public class PrintingEvenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to print Even Number");
        int number=sc.nextInt();

        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println(i);
            }

        }

sc.close();
    }
}