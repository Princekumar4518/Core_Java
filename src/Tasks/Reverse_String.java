package Tasks;

import java.util.Locale;

public class Reverse_String {
    public static void main(String[] args) {
        String str="Naman";
        String Reverse="";

        for(int i=0;i<str.length();i++){
            Reverse=str.charAt(i)+Reverse;
        }

        System.out.println("reverse String = "+" "+Reverse);

    }
}
