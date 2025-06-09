package Tasks;
import java.util.Scanner;

public class Vowel_Consonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String");
        String Input = sc.nextLine();

        int vowel_count = 0;
        int consonent_count = 0;

        String vowel_string = "";
        String consonent_string = "";

        if (Input.isEmpty() || Input.length() <= 1) {
            System.out.println("Please Enter a valid String");
            System.exit(0);
        } else {
            for (int i = 0; i < Input.length(); i++) {

                if (Input.toLowerCase().charAt(i) == 'a' || Input.toLowerCase().charAt(i) == 'e'
                        || Input.toLowerCase().charAt(i) == 'i' || Input.toLowerCase().charAt(i) == 'o'
                        || Input.toLowerCase().charAt(i) == 'u') {
                    vowel_count++;
                    vowel_string += Input.charAt(i);


                } else {
                    consonent_count++;
                    consonent_string += Input.charAt(i);
                }

            }

            System.out.println(vowel_count + " " + "vowels present in given String");
            System.out.println("Vowels in given String are =" + " " + vowel_string);

            System.out.println("**********************************");

            System.out.println(consonent_count + " " + "consonents present in given String");
            System.out.println("Consonents in given String are =" + " " + consonent_string);


        }
    }

}