/*Write a program to sum first n even numbers using a while loop. */

import java.lang.*;
import java.util.*;

class SumEvenNumbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of even numbers to be summed: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i <= 2*n){
            sum += i;
            i += 2;
        }
        System.out.println("The sum is: " + sum);
        sc.close();
    }
}