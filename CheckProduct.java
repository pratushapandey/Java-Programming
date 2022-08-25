/*Write a method hasEqualProduct with 3 parameters of type int.

The method should return boolean and it needs to return true if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.  

Example 
Input :
2 3 6

Output :
True  

Explanation:
Since 2*3 is equal to 6, hence return true. */

import java.lang.*;
import java.util.*;

class CheckProduct{
    public static boolean hasEqualProduct(int a, int b, int c){
        int product = a * b;
        if(product == c) return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = hasEqualProduct(a,b,c);
        if(check == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
