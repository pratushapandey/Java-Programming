import java.lang.*;
import java.util.*;

class StudentDetails{
    private String FirstName;
    private String LastName;
    private int Marks;

    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
       if(FirstName == null){
        return " ";
       }
       else{
        return FirstName;
       }
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLastName(){
        if(LastName == null){
            return " ";
        }
        else{
            return LastName;
        }
    }
    public void setMarks(int Marks){
        if(Marks < 0 || Marks > 100){
            this.Marks = 0;
        }
        else{
            this.Marks = Marks;
        }
    }
    public int getMarks(){
        return Marks;
    }
    public String Fullname(){
        return getFirstName() + " " + getLastName(); 
    }
    public boolean isPass(){
        if(Marks >= 33 && Marks <= 100){
            return true;
        }
        else{
            return false;
        }
    }
}
    class Student{
    public static void main(String[]args){
        StudentDetails student = new StudentDetails();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setMarks(marks);
        System.out.println("Full Name : " + student.Fullname());
        boolean answer = student.isPass();
        if(answer){
            System.out.println("You have passed the exam");
        }
        else{
            System.out.println("You have failed the exam");
        }
        sc.close();
    }
}
