/*Write a program to accept three number and check whether they are pythagorean triplet or not.    */

import java.lang.*;
import java.util.*;

class Check{
    double a,b,c;
    public static boolean check(boolean checker, double a, double b, double c){
        double sum = Math.pow(a, 2) + Math.pow(b, 2);
        double sq = Math.pow(c,2);
        if(sum == sq) return true;
        else return false;
    }
    public void setVal(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void getVal(){
        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
        System.out.println("Value of c :" + c);
    }
}
class PathagoreanTriplet{
    public static void main(String[]args){
        Check check = new Check();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        check.setVal(a,b,c);
        check.getVal();
        boolean checking = false;
        boolean checker = check.check(checking,a,b,c);
        if(checker == true){
            System.out.println("The values " + a + "," + b + "," + c +" are pathagorean triplets.");
        }
        else{
            System.out.println("The values " + a + "," + b + "," + c +" are not pathagorean triplets.");
        }
        sc.close();
    }
}
