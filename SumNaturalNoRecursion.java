import java.lang.*;
import java.util.*;

public class SumNaturalNoRecursion {
    public static int Sum(int n){
        if(n == 0){
            return 0;
        }
        else{
            return n + Sum(n-1);
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find the sum : ");
        int num = sc.nextInt();
        System.out.println("The sum of number is : " + Sum(num));
        sc.close();
    }
}
