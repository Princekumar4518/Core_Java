package Java_Tasks._10July.Overriding;

// 🔹 Task 2: Vehicle Start
//Title: Demonstrate engine start behavior using overriding

//Description:
//Create a base class Vehicle with a method start().
//Create Bike and Car classes that override the start() method:
//Bike prints "Kick start the bike"
//Car prints "Turn the key to start the car"
//This shows how polymorphism works with method overriding.

public class _02task {
    public static void main(String[] args) {

        Vehical vc=new Vehical();
        vc.start();

        Vehical bike=new Bike();
        bike.start();

        Vehical car=new Car();
        car.start();

    }
}


class Vehical{

    void start(){
        System.out.println("Vehical Start");
    }

}

class Bike extends Vehical{

    @Override
    void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehical{

    @Override
    void start() {
        System.out.println("Turn the key to start the car");
    }
}


