package Opps_Concept.Constructor;

public class Constructor_Exp_01 {
    public static void main(String[] args) {
     before_execution b= new before_execution();
     new before_execution(); // 2nd time call

    }
}

class before_execution{
    before_execution(){   // default constructor
        System.out.println("I want to read CSV file");
        System.out.println("Open the page before loading the script");
    }
}
