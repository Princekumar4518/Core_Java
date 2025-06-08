package Opps_Concept.Constructor;

public class Parameterized_constructor {
    String model;
    int year;

    Parameterized_constructor(){
    model="xxx";
    year =1990;
        System.out.println("DC");
    }

    Parameterized_constructor(String model_name,int inv_year){ // Parameterized constructor
        this.model=model_name;
        this.year=inv_year;
    }


public static void main(String[] args) {
    Parameterized_constructor pc = new Parameterized_constructor();
    System.out.println(pc.model);
    System.out.println(pc.year);

    Parameterized_constructor pc1 = new Parameterized_constructor("tesla", 2015);
    System.out.println(pc1.model);
    System.out.println(pc1.year);
}


}