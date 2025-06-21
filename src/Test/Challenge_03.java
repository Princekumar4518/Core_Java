package Test;

//Write a program that demonstrates comparison and logical operators.
//Input 10,5
//Output a == b: false a > b: true a < b: false (a > b) && (a > 0): true (a < b) || (a > 0): true !(a > b): false

public class Challenge_03 {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        System.out.println("a==b :"+" "+(a==b));
        System.out.println("a>b :"+" "+(a>b));
        System.out.println("a<b :"+" "+(a<b));
        System.out.println("(a > b) && (a > 0) :"+" "+((a > b) && (a > 0)));
        System.out.println("(a < b) || (a > 0) :"+" "+((a < b) || (a > 0)));
        System.out.println("!(a > b) :"+" "+(!(a > b)));

    }
}
