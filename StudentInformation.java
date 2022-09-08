import java.lang.*;
import java.util.*;

class StudentInfo{
    private String StudentName;
    private String StudentRollNo;
    private String StudentStandard;
    private String StudentSection;

    // DEFAULT VALUES
    public StudentInfo(){
        this("DefaultName" , "000" , "X" , "A");
    }

    // TWO PARAMETERS TAKEN AND TWO ARE DEFAULT
    public StudentInfo(String StudentName, String StudentRollNo){
        this(StudentName, StudentRollNo,"X", "A");
    }

    // ALL PARAMETERS TAKEN
    public StudentInfo(String StudentName, String StudentRollNo, String StudentStandard, String StudentSection){
        this.StudentName = StudentName;
        this.StudentRollNo = StudentRollNo;
        this.StudentStandard = StudentStandard;
        this.StudentSection = StudentSection;
    }

    public String getStudentName(){
        return StudentName;
    }

    public String getStudentRollNo(){
        return StudentRollNo;
    }

    public String getStudentStandard(){
        return StudentStandard;
    }

    public String getStudentSection(){
        return StudentSection;
    }
}
class StudentInformation{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Name: ");
        String StudentName = sc.nextLine();
        System.out.println("Enter the Student Roll No: ");
        String StudentRollNo = sc.nextLine();
        System.out.println("Enter the Student Standard: ");
        String StudentStandard = sc.nextLine();
        System.out.println("Enter the Student Section: ");
        String StudentSection = sc.nextLine();
        StudentInfo Student1 = new StudentInfo();
        System.out.println("The name of Student is : " + Student1.getStudentName());
        System.out.println("The name of Student is : " + Student1.getStudentRollNo());
        System.out.println("The name of Student is : " + Student1.getStudentStandard());
        System.out.println("The name of Student is : " + Student1.getStudentSection());
        StudentInfo Student2 = new StudentInfo(StudentName, StudentRollNo);
        System.out.println("The name of Student is : " + Student2.getStudentName());
        System.out.println("The name of Student is : " + Student2.getStudentRollNo());
        System.out.println("The name of Student is : " + Student2.getStudentStandard());
        System.out.println("The name of Student is : " + Student2.getStudentSection());
        StudentInfo Student3 = new StudentInfo(StudentName, StudentRollNo, StudentStandard, StudentSection);
        System.out.println("The name of Student is : " + Student3.getStudentName());
        System.out.println("The name of Student is : " + Student3.getStudentRollNo());
        System.out.println("The name of Student is : " + Student3.getStudentStandard());
        System.out.println("The name of Student is : " + Student3.getStudentSection());
        sc.close();
    }
}