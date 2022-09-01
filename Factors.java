/*Write a method named printFactors with one parameter of type int named number.  

If number is < 1, the method should print "Invalid Value".  

The method should print all factors of the number. A factor of a number is an integer which divides that number wholly (i.e. without leaving a remainder).

For example, 3 is a factor of 6 because 3 fully divides 6 without leaving a remainder. In other words 6 / 3 = 2.

EXAMPLE INPUT/OUTPUT:  

printFactors(6); → should print 1 2 3 6
printFactors(32); → should print 1 2 4 8 16 32
printFactors(10); → should print 1 2 5 10
printFactors(-1); → should print "Invalid Value" since number is < 1 */

import java.lang.*;
import java.util.*;

class Factors{
    public static void PrintFactors(int number){
        if(number < 1){
            System.out.println("Invalid Number");
        }
        System.out.println("The factors are : ");
        for(int i = 1; i <= number; i++){
            if( number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        PrintFactors(num);
        sc.close();
    }
}