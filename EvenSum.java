import java.lang.*;
import java.util.*;

class EvenSum{
    public static boolean isEven(int num){
        if(num < 0){
            return false;
        }
        else{
            if(num % 2 == 0){
                System.out.println("The numbers present in between are : " + num);
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void sumEven(int num1, int num2){
        int sum = 0;
        for(int i = num1; i <= num2; i++){
            if(isEven(i)){
                sum += i;
            }
        }
        System.out.println("Sum of even numbers between " + num1 + " and " + num2 + " is " + sum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting and ending number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sumEven(num1,num2);
        sc.close();
    }
}
