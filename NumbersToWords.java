/*Write a method called numberToWords with one int parameter named number.

The method should print out the passed number using words for the digits.

If the number is negative, print “Invalid Value”.  

Example Input/Output   

numberToWords(123)-> should print “One Two Three”.
numberToWords(3456)-> should print “Three Four Five Six”.
numberToWords(-7)-> should print “Invalid Value” since parameter is negative; */

import java.lang.*;
import java.util.*;

class NumbersToWords{
    public static void numbersToWords(int number){
        if(number < 0){
            System.out.println("Invalid Number");
        }
        else{
            int temp = number;
            ArrayList <String> list = new ArrayList <String> ();
            String arr[] = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"};
            while(temp != 0){
                list.add(arr[temp % 10]);
                temp /= 10;
            }
            for(int i = list.size()-1; i >= 0; i--){
                System.out.print(list.get(i) + " ");
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        numbersToWords(num);
        sc.close();
    }
}