package Java_Tasks._23June;

import java.util.Scanner;

public class CheckDivisibleBy5and11 {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int number;

            System.out.println("Enter the number : ");
            if(sc.hasNextInt()){
                number=sc.nextInt();

                // calling fuction
                checkDivisibility(number);

            }

        }

        // creating function for checking Divisablity
        public static void checkDivisibility(int number){

            boolean divisbleBy5=number%5==0;
            boolean divisbleBy11=number%11==0;

            if(divisbleBy5 || divisbleBy11){
                System.out.println(number+" "+"is divisble by 5 and  11");
            }
            else if(divisbleBy5){
                System.out.println(number+" "+"is divisble by 5");
            }

            else if(divisbleBy11 ){
                System.out.println(number+" "+"is divisble by 11");
            }

            else{
                System.out.println(number+" "+"is not divisble by 5 or 11");
            }
        }










        // using if else


//       System.out.println("Enter the number : ");
//            if(sc.hasNextInt()){
//        number=sc.nextInt();
//
//
//        if(number%5==0 && number%11==0){
//            System.out.println(number+" "+"is divisble by 5 and  11");
//        }
//        else if(number%5==0){
//            System.out.println(number+" "+"is divisble by 5");
//        }
//
//        else if(number%11==0){
//            System.out.println(number+" "+"is divisble by 11");
//        }
//
//
//
//    }
//
//
//
//
//
//
//

    }




