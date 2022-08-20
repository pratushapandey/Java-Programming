/* Write a function to print the following pattern:
                                    *

                                    **

                                    ***

                                    ****                                                     */
import java.lang.*;
import java.util.*;

class Pattern1Recursion{

    public static void printn(int n){
        if(n==0){
            return;
        }
        System.out.print("*");
        printn(n-1);
    }

    public static void Pattern(int n,int i){
        if(n == 0){
            return ;
        }
        printn(i);
        System.out.println("");
        Pattern(n-1,i+1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n = sc.nextInt();
        Pattern(n,1);
        sc.close();
    }
}