package Java_Tasks._10July.Overloading;

// 🔹 Task 4: Greet User
//Title: Greet users differently using overloading

//Description:
//Create a class Greeter with the following methods:
//greet() – prints "Hello!"

//greet(String name) – prints "Hello, [name]!"
//This task teaches overloading based on the number of parameters.

public class task_04 {
    public static void main(String[] args) {

        Greeter wishes=new Greeter();
        wishes.greet();
        wishes.greet("Prince");
    }
}

class Greeter {

   void greet() {
        System.out.println("Hello !");
    }

    void greet(String name){
        System.out.println("Hello "+name);
    }


}

