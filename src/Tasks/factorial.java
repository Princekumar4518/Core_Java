package Tasks;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value which you find factorial : ");
        int value=sc.nextInt();
        int factorial=1;

        if(value<0){
            System.out.println("Factorial of Negative numbers does not exist");
        }
        else{
            for(int i=1;i<=value;i++){
                factorial=factorial*i;
            }
            System.out.println("factorial of" + value + "is = " +factorial);
        }
    }
}
