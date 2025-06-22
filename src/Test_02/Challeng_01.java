package Test_02;

// Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
// Input Create Person objects with names "John" (25) and "Alice" (30)
// Output Name: John, Age: 25 Name: Alice, Age: 30

public class Challeng_01 {
    public static void main(String[] args) {
        Person John=new Person();
        System.out.println( John.name="John");
        System.out.println(John.Age=25);

        Person Alice=new Person();
        System.out.println( Alice.name="John");
        System.out.println(Alice.Age=25);
    }
}

class Person{
    String name;
    int Age;
}
