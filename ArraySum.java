import java.lang.*;
import java.util.*;

class ArraySum {
    public static void main(String[] args){
        int [] marks = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects : ");
        for(int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum+=marks[i];
        }
        System.out.println("Sum of marks is : " + sum);
        sc.close();
    }
}