/*Write a program to print the sum of multiplication table of a given number n. */

import java.lang.*;
import java.util.*;

class MultiplicationTableSum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table: ");
        int num = sc.nextInt();
        int sum = 0;
        System.out.println("The multiplication  table is");
        for(int i = 1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
            sum += num*i;
        }
        System.out.println("The sumof multiplication table is: " + sum);
        sc.close();
    }
}
