package Pattern_Questions;


// Inverted Right-Angled Triangle.
public class InvertedRightAngledTriangle {
    public static void main(String[] args) {


        int n=5;
        for(int i=1;i<=n;i++){ // for outer loop printing rows

            for(int j=5;j>=i;i++){   // inner loop for printing columns
                System.out.print("*");
            }

            System.out.println(); // adding new line
        }              // 5 5
    }


}

