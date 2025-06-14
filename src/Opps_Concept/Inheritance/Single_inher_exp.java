package Opps_Concept.Inheritance;

public class Single_inher_exp {
    public static void main(String[] args) {
        Test_Case1 t1=new Test_Case1();
        t1.running1();

        Test_Case2 t2=new Test_Case2();
        t2.running2();


    }
}

class Common_Test_case{
    void StartBrowser(){
        System.out.println("Satrting Browser !!");
    }

    void CloseBrowser(){
        System.out.println("Closing Browser !!");
    }

}
 class Test_Case1 extends Common_Test_case{

    void running1(){
        StartBrowser();
        System.out.println("Running Tes Case 1");
        CloseBrowser();
        System.out.println("________________________________");
    }
 }

 class Test_Case2 extends Common_Test_case{
     void running2(){
         StartBrowser();

         System.out.println("Running Tes Case 2");
         CloseBrowser();

     }
 }
