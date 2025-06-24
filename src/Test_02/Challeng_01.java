package Test_02;

// Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
// Input Create Person objects with names "John" (25) and "Alice" (30)
// Output Name: John, Age: 25 Name: Alice, Age: 30

public class Challeng_01 {
    public static void main(String[] args) {
        Person John=new Person();
        String jname= John.name="John";
        int jage=John.Age=25;

        System.out.println( "Name :"+" "+jname+"  "+"Age :"+" "+jage);


        Person Alice=new Person();
        String Aname=Alice.name="Alice";
        int Aage=Alice.Age=30;
        System.out.println( "Name :"+" "+Aname+"  "+"Age :"+" "+Aage);

    }
}

class Person{
    String name;
    int Age;
}
