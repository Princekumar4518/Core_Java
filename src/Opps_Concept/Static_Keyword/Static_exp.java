package Opps_Concept.Static_Keyword;

public class Static_exp {
    public static void main(String[] args) {


//        - The static keyword in Java.
//                - Non-access modifier that is used to indicate that a particular member(variable, method).
//        - Belongs to the class itself.
//        - **Static members are shared among all instances.**
//        - They can be accessed **without creating an object of the class.**
//
//
//        1. Static Block -> (SIB)
//                2. Static Variable
//        3. Static Method
//        4. _Static Class - (not useful)_


        Student s1=new Student(22);
        Student s2=new Student(25);
        System.out.println(s1.age);
        System.out.println(s2.age);

        System.out.println(s1.course_name);  // means staic is same for all of them
        System.out.println(s2.course_name);  //it means you want to share with other object

         Student.m1();




    }
}

class Student{
     int age;  // non-static
    static  String course_name="XYZ";

    public Student(int age) {
        this.age = age;
    }

    static void m1(){
        System.out.println("Static Method");
    }
}