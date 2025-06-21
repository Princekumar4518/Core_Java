package Test;
// Write a program to check if a given year is a leap year.
public class Challenge_08 {
    public static void main(String[] args) {
        int year=1900;
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year+" "+" is a leap year");
        } else {
            System.out.println(year+" "+" is not a leap year");
        }
    }
}
