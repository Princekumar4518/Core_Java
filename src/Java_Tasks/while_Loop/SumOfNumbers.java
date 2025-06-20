package Java_Tasks.while_Loop;
import java.util.Scanner;
public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to Add");
        int number=sc.nextInt();

        int i=1;
        int sum=0;
        while(i<=number){
          sum+=i;
            i++;
        }
        System.out.println("Sum is = "+" "+sum);
        sc.close();
    }
}


