package Test;

// Write a program to check if a number is positive, negative, or zero.
// input -7,15

public class Challenge_06 {
    public static void main(String[] args) {

        System.out.println("Enter number for veriyfying");
        int number=15;

    if(number>0){
        System.out.println(number+" "+" is a positive number");
    }
    else if(number==0){
        System.out.println("This is a Zero");
    }
    else{
        System.out.println(number+" "+" is a negative number");
    }

    }
}
