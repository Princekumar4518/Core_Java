package Opps_Concept.Inheritance;

public class Hierarihal {
    public static void main(String[] args){
        Realme_3i r3=new Realme_3i();
        r3.logo();
        r3.tune();
        r3.i3_feature();

        System.out.println("#################################");

        Realme_c3 c3=new Realme_c3();
        c3.logo();
        c3.tune();
        c3.C3_feature();

        System.out.println("#################################");

        Realme_5i i5 =new Realme_5i();
        i5.logo();
        i5.tune();
        i5.i5_feature();

        System.out.println("#################################");

        Realme_XT xt=new Realme_XT();
        xt.logo();
        xt.tune();
        xt.xt_feature();
    }
}


class Realme_Phn{

    void logo(){
        System.out.println("Realme Logo");
    }
     void tune(){
         System.out.println("Official tune");
     }

}


class Realme_c3 extends Realme_Phn{
    void C3_feature(){
        System.out.println("Realme C3 Features");
    }

}

class Realme_3i extends Realme_Phn{
    void i3_feature(){
        System.out.println("Realme 3i Features");
    }

}

class Realme_5i extends Realme_Phn{
    void i5_feature(){
        System.out.println("Realme 5i Features");
    }

}

class Realme_XT extends Realme_Phn{
    void xt_feature(){
        System.out.println("Realme XT Features");
    }

}