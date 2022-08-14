import java.lang.*;
import java.text.DecimalFormat;
import java.util.*;

class MarksIfElse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Physics: ");
        float marks1 = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry: ");
        float marks2 = sc.nextFloat();
        System.out.println("Enter the marks of Mathematics: ");
        float marks3 = sc.nextFloat();
        float total = marks1 + marks2 + marks3;
        System.out.println("Total Marks obtained is: " + total);
        float percentage = total * 100/300;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        if(percentage >= 40)
        {
            if (marks1 >= 33 && marks2 >= 33 && marks3 >=33)
            {
                System.out.println("You have been passed with " + df.format(percentage) + "%.");
            }
            else{
                System.out.println("You have failed in one or more subjects.");
            }
        }
        else{
            System.out.println("You have failed as your percentage is below 40%.");
        }
        sc.close();
    }
}
