package Java_Tasks._10July.Overriding;

// 🔹 Task 4: Login Functionality
//Title: Different login behaviors for users

//Description:
//Create a class User with method login() that prints “User login”.
//Create subclasses AdminUser and RegularUser, each overriding login() with their own logic/messages.
//Demonstrate calling the login() method using base class reference to highlight runtime polymorphism.

public class _04task {
    public static void main(String[] args) {

        User us=new User();
        us.login();

        User rg=new RegularUser();
        rg.login();

        User au=new AdminUser();
        au.login();

    }
}


class User{

    void login(){
        System.out.println("User Login Successfully");
    }

}

class RegularUser extends User{

    @Override
    void login() {
        System.out.println("Regular User Login Successfully");
    }
}

class AdminUser extends User{

    @Override
    void login() {
        System.out.println("Admin Login Successfully");
    }
}


