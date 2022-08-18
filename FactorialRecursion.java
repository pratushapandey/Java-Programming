import java.lang.*;
import java.util.*;

public class FactorialRecursion {
    public static int Factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbe who's factorial you want to calculate : ");
        int n = sc.nextInt();
        System.out.println("The factorial of the number is : " + Factorial(n)); 
        sc.close();
    }
}
