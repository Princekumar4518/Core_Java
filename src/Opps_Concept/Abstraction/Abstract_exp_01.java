package Opps_Concept.Abstraction;

public class Abstract_exp_01 {
    public static void main(String[] args) {

//        Abstraction in Java is the process of **hiding implementation details and showing only essential information to the user.**
//
//        Java provides two primary mechanisms to achieve abstraction:

//        Abstract class cannot be instantiated
//
//        1. Abstract - C
//        2. Interface - I

        Son s1=new Son();
        s1.loan50k();


    }
}


class Normal{
    //Concreat class - Complete class
}

abstract class Father{
    abstract void loan50k();
}

class Son extends Father{

    @Override
    void loan50k() {
        System.out.println("Loan given");
    }
}