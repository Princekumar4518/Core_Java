package Opps_Concept.Encapsulation;

public class Encapsulation_exp_01 {
    public static void main(String[] args) {

        VMLogin login=new VMLogin("admin","7890");
        System.out.println(login.getUsername());
        System.out.println(login.getPassword());
        login.setPassword("635626",false);
        login.setPassword("6356@52jjsj6",true);
        System.out.println(login.getPassword());
    }
}

//class VMLogin{
//    String Username;
//    String Password;
//
//    public VMLogin(String username, String password) {
//        this.Username = username;
//        this.Password = password;
//    }                                     this is not a Encapsulation
//}


class VMLogin {
    private String username;
    private String password;

    public VMLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("Only Admin Change the password");
        }
    }

}


// In case of encapsulation we handle private date members with the help of getter setter method