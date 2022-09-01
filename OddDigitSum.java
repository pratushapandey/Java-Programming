import java.lang.*;
import java.util.*;

class OddDigitSum{
    public static int getOddDigitSum(int number){
        int count;
        int sum = 0;
        if(number < 0){
            return -1;
        }
        while(number != 0){
            if((number % 10)%2 != 0){
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number = sc.nextInt();
        System.out.println("The sum of odd digits is : " + getOddDigitSum(number));
        sc.close();
    }
}