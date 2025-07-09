package Java_Tasks._9July;

// ✅ Task 3: "Multilevel Login System"

//📄 Description: (Multilevel Inheritance)

//Create a class User with a method login().
//Extend it with a class AdminUser that adds a method accessAdminPanel().
//Then create a SuperAdmin class that extends AdminUser and adds a method shutdownSystem().

//Use an object of SuperAdmin to call all three method


public class task_03 {
    public static void main(String[] args) {
        superAdmin sA =new superAdmin();

        sA.login(); //  using superAdmin object calling User class method

        sA.accessAdminPanel();   //  using superAdmin object calling adminUser class method

        sA.shutdownSystem();    //  calling own method
    }
}


class User{

    void login(){
        System.out.println("Successfully Login");
    }
}

class adminUser extends User{

   void accessAdminPanel(){
       System.out.println("Only Admin Access this");
   }
}

class superAdmin extends adminUser{

    void shutdownSystem(){
        System.out.println("Successfully Shut Down");
    }
}