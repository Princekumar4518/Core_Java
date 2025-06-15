package Opps_Concept.Polymorphism;

public class Method_Overloading {

    public static void main(String[] args) {
        Math_Operation Mo=new Math_Operation();
        int two=Mo.add(10,30);
        int three=Mo.add(45,56,78);
        int four=Mo.add(78,3,7,0);

        System.out.println("Sum of Two number is ="+" "+two);
        System.out.println("Sum of Three number is ="+" "+three);
        System.out.println("Sum of four number is ="+" "+four);
    }

}



    class Math_Operation {


        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        int add(int a, int b, int c, int d) {
            return a + b + c + d;
        }

    }