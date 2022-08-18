import java.lang.*;
import java.util.*;

class MultiplicationTableRecursion {
    public static void multiplicationTable(int n,int i){
        System.out.println("");
        System.out.println(n + " * " + i + " = " + n*i);
        if(i < 10)
        {
            multiplicationTable(n,i+1);
        }
       } 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for table : ");
        int n = sc.nextInt();
        multiplicationTable(n,1);
        sc.close();
    }
}
