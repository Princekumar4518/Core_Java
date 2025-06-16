package Opps_Concept.Interface;



public class Interface_exp_01 {
    public static void main(String[] args) {



//        - interface is a keyword which is used to define User Defined Datatypes.
//        - Interface variables will be inherited to subclasses.
//        - Interfaces can be used to achieve** multiple inheritance in Java.**
//                - **Variables declared** in the interface are by default **public final and static**.
//        - Methods declared in the interface are by default **public and abstract.**
//        - Interface can contain the following members:
//        1. public final static variables
//        2. public abstract methods

        Alto alt=new Alto();
        alt.drive();


    }
}



class Alto extends Engine implements Tyre,gear {

    void drive(){
        rubberTyre();
        blackTyre();
        startEngine();
        changegear();
        stopEngine();
    }

    @Override
    public void rubberTyre() {
        System.out.println("Supreme quality");

    }

    @Override
    public void blackTyre() {
        System.out.println("Black color");

    }

    @Override
    public void burnTheTyre() {

    }


    @Override
    public void changegear() {
        System.out.println("Gear Changing");
    }

    @Override
    void startEngine() {
        System.out.println("Start the Alto");
    }
}

abstract class Engine{
    abstract void startEngine();

    void stopEngine(){
        System.out.println("STOP");
    }

}

interface Tyre{     // in interface we can't use complete function except default and static
    void rubberTyre();  // the benefit of interface is we can use multiple interfaces
    void blackTyre();

    default void burnTheTyre() {     // complete function with the help of default keyword and also static
    }
        static void m1(){
    }
}

interface gear{

    void changegear();
}
