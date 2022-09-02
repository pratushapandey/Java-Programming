import java.lang.*;
import java.util.*;

class NameInput{
    private String FirstName;
    private String LastName;

    public void setFirName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirName(){
        return FirstName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLasName(){
        return LastName;
    }
    public String getFullName(){
        return getFirName() + " " + getLasName();
    }
}

class Name{
    public static void main(String[]args)
    {
        NameInput nameinp = new NameInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter your last name : ");
        String lastName = sc.nextLine();
        nameinp.setFirName(firstName);
        nameinp.getFirName();
        nameinp.getLasName();
        nameinp.setLastName(lastName);
        String fullname= nameinp.getFullName();
        System.out.println("Your full name is : " + fullname);
        sc.close();
    }
}