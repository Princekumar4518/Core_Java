package Test;

// Create a program that demonstrates pre-increment, post-increment, pre-decrement, and post-decrement operators.
// input 5
 // output Original: 5 Pre-increment: 6 Post-increment: 6 (returned 6) Pre-decrement: 5 Post-decrement: 5 (returned 5)
public class challenge_04 {
    public static void main(String[] args) {
        int a=5;

 //  Increment
        System.out.println("Original :"+" "+a);
        System.out.println("Pre-increment" + " "+ ++a);
//        System.out.println(a); // Now updated value of a

        System.out.println("Post-increment" + " "+  a++); //Post Increment in which value print first and then increase
        // but original value of a is 7 see
//        System.out.println(a);



        System.out.println("*************************************");




        //  Decrement


        --a; // for maintaing Required output  because original value is 7
        System.out.println("Pre-decrement" + " "+ --a);
//        System.out.println(a); // Now updated value of a

        System.out.println("Post-decrement" + " "+  a--); //Post decrement in which value print first and then decrease
        // but original value of a is 7 see
//        System.out.println(a);

    }
}
