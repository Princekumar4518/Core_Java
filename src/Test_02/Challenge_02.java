package Test_02;
// Implement a class "Student" with attributes "name", "rollNo", and "section". Add a method to print student details.
// output Student: Bob, Roll No: 101, Section: A

public class Challenge_02 {
    public static void main(String[] args) {
        Student stu=new Student();
        stu.Details("Bob",101,'A');
    }
}
class Student{
    String name;
    int rollno;
    char section;

   void Details(String name,int rollno,char section){
        System.out.println("Student : "+name+"  "+"Roll No : "+rollno+"  "+"Section: "+section);

    }
}