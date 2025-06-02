package Arrays;

import java.sql.Array;

public class Array_Exp_01 {
    public static void main(String[] args) {

        int a = 10;
        int[] marks = {91, 90, 51, 100, 91, 92, 89};
        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);
//        System.out.println(marks[-1]); // //ArrayIndexOutOfBoundsException
//        System.out.println(marks[10]); // .ArrayIndexOutOfBoundsException

        char c = 'A';
        String name = "prince";
        String[] name_each_element_char = name.split("");
        // ["p","r","i","n","c","e"]
        System.out.println(name_each_element_char[1]);  // r


    }
}
