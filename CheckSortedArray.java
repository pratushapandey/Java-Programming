import java.lang.*;
import java.util.*;
 
class CheckSortedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements in the array :");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Entered elements in the array are : ");
        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        int flag = 0;
        for(int i = 0; i < n-1; i++){
            if(arr[i]>arr[i+1]){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.print("Array is sorted");
        }
        else{
            System.out.print("Array is not sorted");
        }
        sc.close();
    }
}    