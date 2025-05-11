package Basic01;

public class Practice_01 {
    public static void main(String[] args) {

        /* when we add a variable and not assign value then it throw error because
           JVM does not assign value for that variable
         */
//        int age;
//        System.out.println("Age = "+age);


        int age=20;
        System.out.println("Age = "+age);


        // for Constant we can use the word final
        // constant means we can not change the variable value

        final int a=78;
//        a=90;  it throw error when we try to change the value
        System.out.println(a);







    }





}
