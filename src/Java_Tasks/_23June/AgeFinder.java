package Java_Tasks._23June;

import java.util.Scanner;

public class AgeFinder {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Age .........");
        int Age;

        if(sc.hasNextInt()){
            Age=sc.nextInt();




            if(Age<0){
                System.out.println("Age is not less than Zero");
            }
            else{
                if(Age>=0 || Age<=12){
                    System.out.println("You are a Child");
                }
                else if (Age>=13 || Age<=19) {
                    System.out.println("You are a Teenager");
                }
                else if (Age>=20 || Age<=64) {
                    System.out.println("You are a Adult");
                }
                else{
                    System.out.println("You are a Senior Citizen");
                }
            }
        }
        else{

            System.out.println("Age is only a Natural Number");
            sc.next();
        }

sc.close();
    }

}
