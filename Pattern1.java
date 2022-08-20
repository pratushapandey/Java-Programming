/*  Write a program using functions to print the following pattern:
                                 *

                                * *

                               * * *

                              * * * *                                                   */
import java.lang.*;
import java.util.*;

public class Pattern1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.println("The pattern is");
        for(int i=0; i<n; i++){
            for(int j = n-i; j>1; j--){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
