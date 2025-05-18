package Operators;

public class Tricky_question {
    public static void main(String[] args) {

        String first_name = "Prince";
        String last_name = "Kumar";

        int a = 45;
        int b = 18;

        System.out.println(first_name + last_name + a + b);          //PrinceKumar4518
        System.out.println(a + b + first_name + last_name);          //63PrinceKumar

        System.out.println(first_name + last_name + (a + b));        //PrinceKumar63

        System.out.println(!(10>20));



        int salary = 12;
        boolean res = !(salary > 10 || salary < 5);
        System.out.println(res);

        // A - salary > 10 -> 12 > 10 -> true
        // B -> salary < 5  12 < 5 -> false
        // !(A || B) -> !(true || false) -> !true - false



        char a1 = 'A'; // ASCII -> 65
        char b1 = 'B'; // 66
        System.out.println(a1 + b1);
        // a1+b1 - 65+66 -> 131


        short s = 10;
        char c = 'A';//65
        System.out.println(c+s);


    }
}
