package Opps_Concept.Inheritance;

public class Single_Inheritance {
    public static void main(String[] args) {
        Son s=new Son();
        System.out.println(s.money);
              s.bhk2();
              s.bhk3();

    }
}

class Father{
    int money=1000;
    void bhk2(){
        System.out.println("Father's 2BHK home");
    }
}

class Son extends Father{
    void bhk3(){
        System.out.println("Son has 3BHK home");
    }
}