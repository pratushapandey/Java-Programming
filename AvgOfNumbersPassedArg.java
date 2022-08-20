import java.lang.*;
import java.util.*;

class AvgOfNumbersPassedArg{
    public static void Average(int ...arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        float avg = sum / arr.length;
        System.out.println ("Sum of marks is : " + sum);
        System.out.println("Average of marks is : " + avg);
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of subjects : ");
        int n = sc.nextInt();
        int[] marks = new int[n];
        System.out.println("Enter the marks of subjects : ");
        for(int i = 0; i < n;i++){
            marks[i] = sc.nextInt();
        }
        Average(marks);
        sc.close();
    }
}