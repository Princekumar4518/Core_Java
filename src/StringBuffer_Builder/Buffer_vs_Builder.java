package StringBuffer_Builder;

public class Buffer_vs_Builder {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Prince";
        String s1 = new String("Prince");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Prince");
        StringBuilder stringBuilder = new StringBuilder("Prince");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());





    }
}
