package Opps_Concept.Enum;

public class exp_02 {
    public static void main(String[] args) {

        System.out.println(URLs.katalon);
        if (URLs.katalon.equals("katalon")) {
            System.out.println("I want to do somethings");
        }
    }
}

// Enum is nothing
enum URLs {
    google, restassured, katalon, vwo
}