package Java_Tasks._9July;
// ✅ Task 1: "Animal Sound Simulator"

//📄 Description:  (Single Inheritance + Method Call)

// Create a base class Animal with a method makeSound(). Then create a derived class Cat that has a method meow().
// In the main method, call both methods using the Cat object.

public class task01 {
    public static void main(String[] args) {
        // cat Object
        Cat cat=new Cat();
        cat.makeSound(); // calling parent class method
        cat.meow();    // calling own method

    }
}

// Base Class
class Animal {

    void makeSound() {
        System.out.println("Animal Sounds");
    }

}
    // Derived class
    class Cat extends Animal{

        void meow(){
            System.out.println("Cat Sound meow meow");
        }

    }
