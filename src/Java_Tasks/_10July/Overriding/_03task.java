package Java_Tasks._10July.Overriding;


//🔹 Task 3: Employee Role Info
//Title: Show employee roles with overridden methods

//Description:
//Create a class Employee with method role() printing “General Employee”.
//Create child classes Manager, Clerk, Tester, each overriding role() to print their specific roles.
//Call role() on each object to show how overriding helps in specialization.

public class _03task {
    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.role();

        Employee man=new Manager();
        man.role();

        Employee cl=new Clerk();
        cl.role();

        Employee test=new Tester();
        test.role();

    }


}


class Employee{

    void role(){
        System.out.println("General Employee");
    }

}

class Manager extends Employee{

    @Override
    void role() {
        System.out.println("I am Manager");
    }
}

class Clerk extends Employee{

    @Override
    void role() {
        System.out.println("I am Clerk");
    }
}


class Tester extends Employee {

    @Override
    void role() {
        System.out.println("I am a Software Tester");
    }
}
