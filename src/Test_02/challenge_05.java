package Test_02;

//Create a class "Animal" and subclasses "Dog" and "Cat". Override a method to make each animal make a sound.

// INPUT:
//Create Dog and Cat objects and call makeSound()

//OUTPUT:
//Dog says: Woof! Woof! Cat says: Meow! Meow!

public class challenge_05 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.print("Dog Says :");
        dog.makeSound();

        Cat cat=new Cat();
        System.out.print("Cat Says :");
        cat.makeSound();

    }
}

class Animal{

    void  makeSound(){
        System.out.println("All animal Sounds");
    }
}

class Dog extends Animal{

    @Override
    void  makeSound(){
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal{


    @Override
    void  makeSound(){
        System.out.println("Meow! Meow!");
    }
}


