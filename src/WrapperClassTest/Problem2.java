package WrapperClassTest;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("first number :");
        int num1=sc.nextInt();

        System.out.println("Second number :");
        int num2=sc.nextInt();

        try{
            int res=num1%num2;
            System.out.println(res);
        }
        catch(ArithmeticException e){
            System.out.println("Can't Divider with zero");
        }
        finally {
            System.out.println("Always executed");
        }

    }
}
