/*WAP to calculate percentage of a student of CBSE Board Exam. His marks for 5 subjects must be taken as 
input from the keyboard.(Marks out of 100).*/

import java.lang.*;
import java.util.*;

class CbseBoardPercentageCalculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter the marks of 1st subject:");
        int num1 = sc.nextInt();
        System.out.println("Enter the marks of 2nd subject:");
        int num2 = sc.nextInt();
        System.out.println("Enter the marks of 3rd subject:");
        int num3 = sc.nextInt();
        System.out.println("Enter the marks of 4th subject:");
        int num4 = sc.nextInt();
        System.out.println("Enter the marks of 5th subject:");
        int num5 = sc.nextInt();
        int total = num1+num2+num3+num4+num5;
        System.out.println("The total marks obtained is: " + total);
        int percentage = (total *100)/500;
        System.out.println("The percentage obtained is :" + percentage + "%");
        sc.close();
    }
}