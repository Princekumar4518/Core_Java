package Opps_Concept.Access_Modifiers.Cop;

public class Cop {

    private int gun;
    String iCard;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("Yes You can shoot!");
    }


    private void defaultFunction(){

    }
}
