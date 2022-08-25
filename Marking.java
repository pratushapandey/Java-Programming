import java.lang.*;
import java.util.*;

class Grade{
   String name;
   float marks;
   public static void Grading(float marks){
       if(marks <= 100 && marks >=80){
           System.out.println("Grade A");
       }
       else if(marks <= 80 && marks >= 65){
           System.out.println("Grade B");
       }
       else if(marks <= 65 && marks >= 50 ){
           System.out.println("Grade C");
       }
       else if(marks <= 50 && marks >= 40){
           System.out.println("Grade D");
       }
       else if(marks <= 40 && marks >= 33){
           System.out.println("Grade E");
       }
       else if(marks <= 33 && marks >= 0){
           System.out.println("Grade F");
       }
       else{
           System.out.println("Enter the correct marks");
       }
   }

   public void setVal(String name, float marks){
       this.name = name;  
       this.marks = marks;
   }
   public void getVal(){
       System.out.println("Name :" + name);
       System.out.println("Marks :" + marks);
   }
}
class Marking{
   public static void main(String[]args){
       Grade grading = new Grade();
       System.out.println("Enter the name and marks: ");
       Scanner sc = new Scanner(System.in);
       String name = sc.nextLine();
       float marks = sc.nextFloat();
       grading.setVal(name,marks);
       grading.getVal();
       grading.Grading(marks);
       sc.close();
   }
}
   
