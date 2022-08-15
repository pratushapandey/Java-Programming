/*Write a program to print the multiplication table of a given number n. */

import java.lang.*;
import java.util.*;

class MultiplicationTable{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for multiplication table: ");
        int num = sc.nextInt();
        System.out.println("The multiplication  table is");
        for(int i = 1; i<=10; i++){
            System.out.println(num + " X " + i + " = " + num*i);
        }
        sc.close();
    }
}
