package Wrapper_Class;

public class exp_04 {
    public static void main(String[] args) {
        String num="10";
        int aa=10;

        //String -> Wrapper Conversion

        Integer a= Integer.parseInt(num);

//        String to primitive
        int q=Integer.parseInt(num);

        Integer s=Integer.valueOf("100");


        Integer aa2=10;
        String ss=aa2.toString();
        System.out.println(ss instanceof String);
    }
}
