import java.lang.*;
import java.util.*;

class MinimumElementArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i = 0; i < n; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Entered elements in the array are : ");
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
        int min = arr[n-1];
        
        for(int i = 0; i < n; i++){
            if(arr[i] < min){
                arr[i] = min;
            }
        }
        System.out.println("Minimum element in the array is : " + min);
        sc.close();
    }
}
