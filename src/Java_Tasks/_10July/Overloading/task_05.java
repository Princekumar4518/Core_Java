package Java_Tasks._10July.Overloading;

//  🔹 Task 5: Find Maximum
//Title: Find max using overloaded functions

//Description:
//Create a class Utility with two methods named max():
//max(int a, int b) returns the larger of two integers
//max(int a, int b, int c) returns the larger of three integers
//max(double a, double b) returns the larger of two decimal values
//Add method calls in main() to compare different types.

public class task_05 {
    public static void main(String[] args) {
        utility ut=new utility();
        System.out.println("Max value of two integer : "+ut.max(12,56));
        System.out.println("Max value of three integer : "+ut.max(12,12,67));
        System.out.println("Max value of two double : "+ut.max(12.9,12.8));
    }
}


class utility{

    int max(int a, int b){
        if (a>b){
            return a;
        }
        else{
            return b;
        }
    }


    int max(int a, int b, int c){

        if (a>b && a>c){
            return a;
        }
        else if (b>a && b>c) {
            return b;

        }
        else {
            return c;
        }
    }


    double max(double a, double b){

        if (a>b){
            return a;
        }
        else{
            return b;
        }

    }
}