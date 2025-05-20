

//Write a program that classifies a triangle based on its side lengths.
// Given three input values representing the lengths of the sides, determine
// if the triangle is equilateral (all sides are equal),
// isosceles (exactly two sides are equal), or scalene (no sides are equal).
// Use an if-else statement to classify the triangle


package Tasks;
import java.util.Scanner;

public class Triangle_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Three Sides Of Triangle : ");

        System.out.println(" Side1 : ");
        int side1 = sc.nextInt();  // taking value from user

        System.out.println(" Side2 : ");
        int side2 = sc.nextInt();  // taking value from user

        System.out.println(" Side3 : ");
        int side3 = sc.nextInt();  // taking value from user



//Using Ternary Operator


        String Result=(side1==side2 && side2==side3)?"This is a Equilateral Triangle ":((side1==side2 ||side2==side3 || side3==side1)?"This is a Isosceles Triangle" : "This is a Scalene Triangle");
        System.out.println(Result);


// Using If else

if(side1==side2 && side2==side3){
    System.out.println("This is a Equilateral Triangle ");
} else if (side1==side2 || side2==side3|| side3==side1) {
    System.out.println("This is a Isosceles Triangle");
}
else {
    System.out.println("This is a Scalene Triangle");
}
    }

}
