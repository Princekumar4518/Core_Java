package Java_Tasks;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number;
        if(sc.hasNextInt()){
            number=sc.nextInt();

            if(number%number==0 && number%1==0){
                System.out.println(number+" "+"is a Prime Number");
            }
            else {
                System.out.println(number+" "+"is not a Prime Number");
            }
        }
        sc.close();

    }
}
