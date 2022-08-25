/*Write a method areEqualByFiveDecimalPlaces with three parameters of type double.The method should return boolean and it needs to return true if three double numbers are the same up to five decimal places.Otherwise, return false.  

Example 

areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up to 5 decimal places.
areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up to 5 decimal places.   */

import java.lang.*;
import java.util.*;
 
class EqualityCheck{
    public static boolean EqualByFiveDecimalPlaces(double a,double b,double c){
        a = a * Math.pow(10,5);
        b = b * Math.pow(10,5);
        c = c * Math.pow(10,5);
        if(a == b && b == c) return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        boolean check = EqualByFiveDecimalPlaces(a,b,c);
        if(check == true){
            System.out.println("The values are equal by five decimal places.");
        }
        else{
            System.out.println("The values are not equal by five decimal places.");
        }
        sc.close();
    }
}