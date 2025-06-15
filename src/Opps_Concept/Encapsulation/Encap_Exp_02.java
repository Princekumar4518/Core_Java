package Opps_Concept.Encapsulation;

public class Encap_Exp_02 {
    public static void main(String[] args) {
     SBI_Bank sbi=new SBI_Bank("Prince",76444374);
        System.out.println(sbi.bank_name);
        System.out.println(sbi.getName());
        System.out.println(sbi.getBalance());

//        boolean isCashier=true;
        sbi.setBalance(53525652,true);
        System.out.println(sbi.getBalance());

    }
}

class SBI_Bank {
    //## Encapsulation
    //- Encapsulation is a fundamental concept in object-oriented programming (OOP).
    //- Bundling of data and methods that operate on that data within a single unit.
    //- Data members should be private in nature.
    //- Methods with getter and setter only, you can access the data members / attributes.


    private String Name;
    private long Balance;
    public String bank_name = "SBI";

    public SBI_Bank(String name, long balance) {
        this.Name = name;
        this.Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long bale, boolean isCashier) {
        if (isCashier) {
            Balance = bale;
        } else {
            System.out.println("Not allowed");
        }
    }
}