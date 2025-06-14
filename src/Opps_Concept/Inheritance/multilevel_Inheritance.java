package Opps_Concept.Inheritance;

public class multilevel_Inheritance {
    public static void main(String[] args) {
        son s=new son();
        s.land();  // son class access all the functions

        Fathers f=new Fathers();
        f.Property();
//        f.bhk3();   can't access it because it access only Grand Father and own property


        GrandFather gf=new GrandFather();
        // it access only own functions

//        son s1 = new Fathers();  not possble
        Fathers f1=new son(); // This is called  Dynamic Dispatch
    }


}

class GrandFather{
    void home(){
        System.out.println("1BHK Home");
    }

    void Property(){
        System.out.println("1 Million Doller");
    }
}

class Fathers extends GrandFather{
    void land(){
        System.out.println("5 Hectoer land");
    }

}

class son extends Fathers{

    void bhk3(){
        System.out.println("3 Bhk ");
    }
}

