/* Write a program to find the factorial of a given number. */

import java.lang.*;
import java.util.*;

class Factorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i = 1; i<=num; i++)
        {
            fact *= i;
        }
        System.out.println("The factorial of the number is : " + fact);
        sc.close();
    }
}
