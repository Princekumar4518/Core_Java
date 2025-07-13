package Java_Tasks._10July.Overloading;

//🔹 Task 2: Print Data
//Title: Create a universal printer with overloading

//Description:
//Create a class Printer with multiple printData() methods to handle different data types:
//printData(String data)
//printData(int data)
//printData(float data)
//Demonstrate in the main() method how the same method name behaves differently depending on the parameter type.

public class Task_02 {
    public static void main(String[] args) {
        Printer print=new Printer();

        System.out.println("Integer Type Data : " +print.printData(45));
        System.out.println("String Type Data : " +print.printData("Rohit Sharama (Hitman)"));
        System.out.println("Float Type Data : " +print.printData(45.56f));





    }
}


class Printer{

    String printData(String data){
        return data;
    }

    int printData(int data){
        return data;
    }

    float printData(float data){
        return data;
    }

}