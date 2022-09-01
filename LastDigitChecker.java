/*Write a method named hasSameLastDigit with three parameters of type int.

 Each number should be within the range of 10 (inclusive) - 1000 (inclusive). If one of the numbers is not within the range, the method should return false.  

The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.  

EXAMPLE INPUT/OUTPUT:  

hasSameLastDigit (41, 22, 71); → should return true since 1 is the rightmost digit in numbers 41 and 71
hasSameLastDigit (23, 32, 42); → should return true since 2 is the rightmost digit in numbers 32 and 42
hasSameLastDigit (9, 99, 999); → should return false since 9 is not within the range of 10-1000 */

import java.lang.*;
import java.util.*;

class LastDigitChecker{
    public static boolean hasSameLastDigit(int a, int b,int c){
        boolean answer = false;
        if((a >= 10 && a <= 1000) && (b >= 10 && b <= 1000) && (c >= 10 && c <= 1000)){
            int a1 = a % 10;
            int b1 = b % 10;
            int c1 = c % 10;
            if(a1 == b1 || a1 == c1 || b1 == c1 ){
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
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean answer = hasSameLastDigit(a,b,c);
        if(answer){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
