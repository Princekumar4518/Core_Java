package Java_Tasks._10July.Overloading;


// 🔹 Task 3: Multiply Numbers
//Title: Multiply using overloaded methods

//Description:
//Create a class MathOperations with two multiply() methods:
//One takes two integers and returns the product
//Another takes three integers and returns their product
//This helps students understand how Java distinguishes methods based on parameter count.

public class task_03 {
    public static void main(String[] args) {

        MultiOperation Mo=new MultiOperation();
        System.out.println("Product of two integer values : "+Mo.multiply(56,34));
        System.out.println("Product of three integer values : "+Mo.multiply(56,34,10));


    }
}

class MultiOperation{

    int multiply(int a, int b){
        return a*b;
    }

    int multiply(int a, int b,int c){
        return a*b*c;
    }

}
