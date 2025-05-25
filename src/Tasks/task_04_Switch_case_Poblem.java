package Tasks;

import java.util.Scanner;

public class task_04_Switch_case_Poblem {
    public static void main(String[] args) {


//        Hint -case 'A': return "Excellent";
//        case 'B': return "Very Good";
//        case 'C': return "Good";
//        case 'D': return "Needs Improvement";
//        case 'F': return "Fail";
//        default: return "Invalid grade";

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Getting Grade : ");
         String grade=sc.next();
         grade=grade.toLowerCase();
        switch (grade){
            case "a":
                System.out.println("Excellent");
                break;

            case "b":
                System.out.println("Very Good");
                break;

            case "c":
                System.out.println("Good");
                break;

            case "d":
                System.out.println("Needs Improvment");
                break;

            case "f":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Inavalid Grade");


              
        }




    }
}
