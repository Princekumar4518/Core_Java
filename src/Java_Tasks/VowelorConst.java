

//Check if a Character is a Vowel or Consonant.

package Java_Tasks;
import java.util.Scanner;
public class VowelorConst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Character to verify is Vowel or Consonent :");

        char character = sc.next().toLowerCase().charAt(0);


            if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
                    || character == 'u') {
                System.out.println(character + " " + "is a Vowel");
            } else {
                System.out.println(character + " " + "is a Consonent");
            }

        }
    }
