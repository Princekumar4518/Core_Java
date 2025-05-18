package TypeCasting;

public class Typecasting {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid syntax -> smaller data into the bigger data type

        // Implicit - Casting - Widening

        byte c = 10;
        int d = c; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int d1 = (int)c; // Widening Explicit Casting (int) - optional

    }
}
