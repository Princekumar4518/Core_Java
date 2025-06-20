package Java_Tasks.For_Loop;
import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to Add");
        int number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=number;i++){
          sum+=i;

        }
        System.out.println("Sum = "+" "+sum);

sc.close();
    }
}


