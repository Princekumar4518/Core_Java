package Java_Tasks._10July.Overriding;

// Task 1: Animal Sounds
//Title: Override sound behavior in subclasses

//Description:
//Create a base class Animal with a method sound().
//Create subclasses Dog, Cat, and Cow, each overriding sound() to return “Bark”, “Meow”, and “Moo” respectively.
//Create an object of each class and call sound() to see how overriding provides different outputs using the same method name.

public class _01task {
    public static void main(String[] args) {

        Animal ani=new Animal();
         ani.sound();

        Animal dog=new Dog();
        dog.sound();

        Animal cat=new Cat();
        cat.sound();

        Animal cow=new Cow();
        cow.sound();

    }
}

class Animal{

    void sound(){
        System.out.println("Sound Hub");
    }

}

class Dog extends Animal{

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal{

    @Override
    void sound() {
        System.out.println("Meow");
    }
}


class Cow extends Animal{

    @Override
    void sound() {
        System.out.println("MOO");
    }
}