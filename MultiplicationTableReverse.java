/*Write a program to print the multiplication table of a given number n in reverse order. */

import java.lang.*;
import java.util.*;

class MultiplicationTableReverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table: ");
        int num = sc.nextInt();
        System.out.println("The multiplication  table is");
        for(int i = 10; i>=1; i--){
            System.out.println(num + " X " + i + " = " + num*i);
        }
        sc.close();
    }
}

