package Pattern_Questions;

// Right-Angled Triangle


public class rightAngleTriangle {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {   // outer loop for printing  rows

            for (int j = 1; j <= i; j++) {   //  inner loop for columns
                System.out.print("*");
            }
            System.out.println();

        }

    }
}