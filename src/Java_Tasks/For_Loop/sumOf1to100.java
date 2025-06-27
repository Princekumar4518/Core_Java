package Java_Tasks.For_Loop;


//Calculate the sum of numbers from 1 to 100
public class sumOf1to100 {
    public static void main(String[] args) {

        int sum=0;

        for(int i=1;i<=100;i++){  // creating condtion

            sum+=i; // intial sum =0+1,sum=1+2 and so on....
        }
        System.out.println("Sum of 1 to 100 natural number is = " +" " + sum); // 5050
    }
}
