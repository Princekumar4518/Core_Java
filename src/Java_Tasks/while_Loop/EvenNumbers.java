package Java_Tasks.while_Loop;

import java.util.Scanner;
public class EvenNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to Add");
        int number=sc.nextInt();

        int i=0;
        while(i<=number){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        sc.close();
    }
}


