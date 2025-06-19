package Exception;

public class Excepion_exp_01 {
    public static void main(String[] args) {


//    ## **Exceptions**
//            - An exception is an event that occurs during the execution of a program that
//            **disrupts the normal flow of instructions. **
//            - it can be handled.
//
//
//            ** Error** is also an event occurred during the program that disturbs the normal
//            flow of the instructions. But it cannot be handled, Error is like stack overflow,
//            memory overflow, memory corrupted.



//        **There are two types exceptions**
//
//                1. **Checked** - **JVM knows it -> **-> Compile Time Exception -
//                JVM will cry - will ask you to fix it before run.
//        1. // Checked Exception
//        FileInputStream fileInputStream = new FileInputStream("C://testdata.txt");


//        2. **Unchecked**. - **JVM don't knows it** --> Runtime -> you will know Exception
//        1. `java.lang.ArithmeticException: / by zero when args -> 0// java.lang.NumberFormatException:
//        For input string: "pramod"// java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds`


        System.out.println("Start the program");
        String ip=args[0];   //  java.lang.ArrayIndexOutOfBoundsException
        int a=Integer.parseInt(ip);
        int b=100/a;

        System.out.println("End of the program");





    }
}