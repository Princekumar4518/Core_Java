package Generic;

public class GENRIC_EXP_01 {
    public static void main(String[] args) {
        generic(4,3.4);
        generic(7.88,"Prince");
    }

    static <T> void generic(T a,T b){
        System.out.println(a);
        System.out.println(b);

    }
}
