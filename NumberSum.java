import java.lang.*;
import java.util.*;

class NumberSum{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int rem;
        int sum = 0;
        do{
            rem = num % 10;
            sum += rem;
            num = num/10;
        }while(num != 0);
        System.out.println("The sum  of digits is : " + sum);
        sc.close();
    }
}