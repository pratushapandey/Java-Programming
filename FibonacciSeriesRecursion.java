import java.lang.*;
import java.util.*;

class FibonacciSeriesRecursion {
    public static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int n = sc.nextInt();
        int result = fib(n);
        System.out.println("The " + n + "th term of fibonacci series is : " + result);
        sc.close();
    }
}
