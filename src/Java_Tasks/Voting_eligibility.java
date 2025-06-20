
// Check if a Person is Eligible to Vote (Age Check).

package Java_Tasks;
import java.util.Scanner;
public class Voting_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verify are you eligible for Voting or not ??");

        System.out.println("Enter your Age : ");
        int Age ;
        if(sc.hasNextInt()) {
            Age = sc.nextInt();


            if (Age > 0) {
                if (Age >= 18) {
                    System.out.println(" Congrtulaton!! ,  You are Eligible for Voting");
                } else {
                    System.out.println(" Ohh No !! ,  You are not Eligible for Voting");
                }
            }
        }
        else{
            System.out.println("Enter only Integer value");
            System.exit(0);
        }
        sc.close();
        System.exit(0);

    }

}