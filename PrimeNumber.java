import java.lang.*;
import java.util.*;

class PrimeNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int flag = 1;
        if(num == 0 || num == 1)
        {
            flag = 1;
        }
        else
        {
            for(int i = 2; i <= num/2; i++)
            {
                if(num % i == 0)
                {
                    flag = 0;
                    break;
                }
                else
                {
                    flag = 1;
                }
            }
        }
        if(flag == 1)
        {
            System.out.println("The number is prime.");
        }
        else
        {
            System.out.println("The number is not prime.");
        }
    }
}
