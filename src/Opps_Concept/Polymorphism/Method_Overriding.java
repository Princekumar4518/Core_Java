package Opps_Concept.Polymorphism;

public class Method_Overriding {
    public static void main(String[] args) {

        Prince p=new Prince();
        p.home();
        p.p1();
    }

}

class father{


    void home(){
        System.out.println("father - 2BHK Home");
    }

    void f1(){
        System.out.println("father- f1");
    }

}

class Prince extends father{
    void p1(){
        System.out.println("Prince - p1");
    }

    @Override
    void home(){
        System.out.println("Prince - 3BhK Home");
    }


}

