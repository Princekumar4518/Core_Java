package Opps_Concept.Super_Keyword;

public class Example_01 {

}
class Baseclass {
    private String browser;

    public Baseclass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Change browser is not allowed");
        }
    }


    void openBrowser() {
        System.out.println("** Opening Browser **");
    }

    void openBrowser(String browserName) {
        System.out.println("** Opening Browser -> " +browserName);
    }

    void closeBrowser() {
        System.out.println("** Closing Browser **");
    }
}
// Super keyword in java is a reference variable that allows access to the method, variable,
// and constructor of parent



class Testcase1 extends Baseclass{
    public Testcase1(String browser){
        super(browser);
        super.openBrowser();
        super.openBrowser("Chrome");
        super.closeBrowser();

    }
}