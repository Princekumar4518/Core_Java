package Opps_Concept.Access_Modifiers.Cop;

public class Jr_Cop {

    public static void main(String[] args) {
        Cop jrCop = new Cop(10);
//        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}



//The **public** modifier allows members to be accessible from any other class in any package.
//
//        1. This is the least restrictive access level.
//
//
//**The private modifier restricts access to the class itself.** Members declared as private are not accessible from any other class, even subclasses.
//
//
//
//The **protected** modifier allows access to members within the same package and also to subclasses in different packages.
//
