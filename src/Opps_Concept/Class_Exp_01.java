package Opps_Concept;

public class Class_Exp_01 {

    // Attributes
    String name;
    int age;
    String gender;
    long phone_no;

    // Behaviour

    void speak(){
        System.out.println("Speaking");
    }
    void eat(){}
    void sleep(){}

    // it does not take memory until we can,t create any object

    public static void main(String[] args) {
        Class_Exp_01 obj = new Class_Exp_01();
        obj.age=19;
        System.out.println(obj.age);
        obj.speak();

        // class => Class_Exp_01
        //object Reference => obj
        //object => new Class_Exp_01()
    }
}


