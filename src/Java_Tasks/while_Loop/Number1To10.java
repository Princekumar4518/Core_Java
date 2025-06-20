package Java_Tasks.while_Loop;

import java.util.Scanner;
public class Number1To10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want to Add");
        int number=sc.nextInt();

        int i=1;
while(i<=number){
    System.out.println(i);
    i++;
}

sc.close();
    }
}


