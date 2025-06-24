package Test_02;
// Implement encapsulation in a class "Employee" with private attributes
// "id", "name", and "salary". Add getter and setter methods.

public class Challenge_03 {
    public static void main(String[] args) {
        Employee emp=new Employee("Prince",10101,35666);
        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());

        // Changing attribute values
        System.out.println("**********************************8");
         emp.setName("Vishal");
        emp.setId(101);
        emp.setSalary(40000);

        System.out.println(emp.getId());
        System.out.println(emp.getName());
        System.out.println(emp.getSalary());


    }
}

class Employee{
    private int id;
    private String name;
    private int Salary;

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.Salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }





    }
