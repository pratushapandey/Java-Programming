import java.lang.*;
import java.util.*;

class Palindrome{
    public static boolean isPalindrome(int num){
        int rev = 0; 
        int temp = num;
        while(temp != 0){
            rev = rev  * 10 + temp % 10;
            temp /= 10;
        }
        if(num == rev)return true;
        else return false;
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("The number " + num + " is a palindrome");
        }
        else{
            System.out.println("The number " + num + " is not palindrome");
        }
        sc.close();
    }
}