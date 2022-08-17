import java.lang.*;
import java.util.*;

class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array : ");
        for(int i= 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Entered array is : ");
        for(int i = 0; i < n ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println("Reserve of the array is : ");
        for(int i = n-1 ; i >= 0; --i){
            System.out.println(arr[i] + " ");
        }
        sc.close();
    }
}
