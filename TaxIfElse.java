import java.lang.*;
import java.util.*;

class TaxIfElse {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary per year: ");
        double salary = sc.nextDouble();
        double tax = 0;
        if(salary < 250000)
        {
            tax = tax +0;
        }
        else if (salary >= 250000 && salary < 500000)
        {
            tax = tax + (salary - 250000)* 0.05;
        }
        else if(salary >= 500000 && salary < 1000000)
        {
            tax = tax + (500000 - 250000)*0.05;
            tax = tax + (salary - 500000)*0.2;
        }
        else
        {
            tax = tax + (500000 - 250000)*0.05;
            tax = tax + (1000000 - 500000)*0.2;
            tax = tax + (salary - 1000000)*0.3;
        }
        System . out.println("The tax paid is : " + tax);
        sc.close();
    }
}
