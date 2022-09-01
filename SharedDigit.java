/*Write a method named hasSharedDigit with two parameters of type int.  

Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.  

The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

  EXAMPLE INPUT/OUTPUT:  

hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers */

import java.lang.*;
import java.util.*;

class SharedDigit{
    public static boolean hasSharedDigit(int a, int b){
        boolean answer = false;
        if((a >=10 && a <= 99) && (b >= 10 && b <= 99)){
            int a1 = a % 10;
            int a2 = a / 10;
            int b1 = b % 10;
            int b2 = b / 10;
            if(a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2){
                return true;
            }
            else{
                return false;
            }
        }
        return answer;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean answer = hasSharedDigit(a,b);
        if(answer){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
