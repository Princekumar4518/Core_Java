package Basic01;

import java.util.Arrays;

public class Print_vs_println_printf {
    public static void main(String[] args) {

        // println adding new line automatically
        System.out.println("This is a statement ");

        // print does not add new line in this case output attach in one line
        System.out.print("output 1");
        System.out.print("Output 2");

        System.out.println();
        //printf used adding formatting style in output
        int a=2;
        int b=67;

        System.out.printf("The value of a =%d and b=%d",a,b);

    }
}
