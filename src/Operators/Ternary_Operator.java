package Operators;

public class Ternary_Operator {
    public static void main(String[] args) {
        int age = 27;
        String canIGoTOGoa =  age > 18 ? "Yes You can" : "You can't";
        System.out.println(canIGoTOGoa);

        int number = 21;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);


    }
}
