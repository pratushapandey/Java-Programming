/*Write a method called printNumberInWord. The method has one parameter number which is the whole number. The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.  */

import java.lang.*;
import java.util.*;

class NumWord{
    int number;
    public void setNumber(int number){
        this.number = number;
    }
    public void getNumber(){
        System.out.println("The number you entered is : " + number );
    }
    public void printNumberInWord(int number){
        switch(number){
            case 0:
            System.out.println("The number in word : Zero");
            break;
            case 1:
            System.out.println("The number in word : One");
            break;
            case 2:
            System.out.println("The number in word : Two");
            break;
            case 3:
            System.out.println("The number in word : Three");
            break;
            case 4:
            System.out.println("The number in word : Four");
            break;
            case 5:
            System.out.println("The number in word : Five");
            break;
            case 6:
            System.out.println("The number in word : Six");
            break;
            case 7:
            System.out.println("The number in word : Seven");
            break;
            case 8:
            System.out.println("The number in word : Eight");
            break;
            case 9:
            System.out.println("The number in word : Nine");
            break;
            default:
            System.out.println("The number you entered is not within 0 to 9.");
        }
    }
}
class NumberInWord{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        NumWord nw = new NumWord();
        nw.setNumber(num);
        nw.getNumber();
        nw.printNumberInWord(num);
        sc.close();
    }
}