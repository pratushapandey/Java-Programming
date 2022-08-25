/*Write a method named hasNotTeen with 3 parameters of type int.

We’ll say that a number is  “teen” if it is in the range 13..19 inclusive, otherwise it is not teen. Given 3 int values, return true if none of them are teen, otherwise return false..

Example 
Sample Input 1 :
13 12 20

Sample Output 1:
False

Explanation:
Since 13 is a teen number, hence false is returned.

Sample Input 2:
9 29 21

Sample output 2:
True

Explanation:
Since numbers 9,29,21 are not in range 13-19, hence true is returned.   */

import java.lang.*;
import java.util.*;

class Teen{
    public static boolean hasNotTeen(int a,int b,int c){
        if( (a >= 13 && a <= 19 ) && (b >= 13 && b<= 19) && (c >= 13 && c <= 19)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of a,b,c :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = hasNotTeen(a,b,c);
        if(check == true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
