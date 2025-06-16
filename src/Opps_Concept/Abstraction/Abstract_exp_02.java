package Opps_Concept.Abstraction;

public class Abstract_exp_02 {
    public static void main(String[] args) {


        Alto al=new Alto();
        al.drive();
    }
}


class Alto extends Engine{

    void drive(){
        startEngine();
        stopEngine();
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

