/* Write a function to print the following pattern:
                                    ****

                                    ***

                                    **

                                    *                                                      */

import java.lang.*;
import java.util.*;

class Pattern2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("The pattern is ");
        for(int i = n-1 ; i>=0; i--){
            for(int j = 0; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}