package Java_Tasks;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {


        int num1 = 56;
        int num2 = 76;
        int num3 = 96;

        if(num1>num2 && num1>num3 ) {
            System.out.println(num1+" "+"is a maximum number");
        } else if (num2>num3 && num2>num1) {
            System.out.println(num2+" "+"is a maximum number");
        }
        else {
            System.out.println(num3+" "+"is a maximum number");
        }
    }


}
