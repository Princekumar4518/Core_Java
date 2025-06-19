package Exception;

public class exp_02 {
    public static void main(String[] args) {
//        int a=0;
//        int b=10;
//        int c=b/a;  // java.lang.ArithmeticException: / by zero
//
//        System.out.println(c);

        // Unchacked -> Arithmetic, NullPointer Exception

        String name=null;
        name.trim();

//  java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null
//	at Exception.
    }
}
