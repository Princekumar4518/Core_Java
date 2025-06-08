package Tasks;
import java.util.Scanner;

public class Palidrom_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String Reverse = "";

            for (int i = 0; i < str.length(); i++) {
                Reverse = str.charAt(i) + Reverse;
            }

            System.out.println("reverse String = " + " " + Reverse);


            if (str.equalsIgnoreCase(Reverse)) {
                System.out.println("Palidrom String = " + " " + str);
            } else {
                System.out.println("No Palidrom String = " + " " + str);
            }
        }
    }
