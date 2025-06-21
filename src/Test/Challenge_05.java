package Test;
// Write a program that demonstrates operator precedence and type casting in Java.
// input 10,3.5
// output Expression result: 23 Implicit casting: 13.5 Explicit casting: 13
public class Challenge_05 {
    public static void main(String[] args) {




        int sum = ((10 / 2) * 4 + 3 - 6 + 3);
        // it using BODMAS rule
        // first bracket open so 10/2=5
        // then multiply 5*4=20
        //then  addition 20+3=23+3=26
        //then subtraction 26-6=20

        System.out.println("sum :"+" "+sum); // output =20

        // Typecasting

        int a = 10;


        float c=a;   // Implicit Casting - This is a Automatically done.
        float d= (float)a;    //Explicit Casting -This is done by user



    }
}

