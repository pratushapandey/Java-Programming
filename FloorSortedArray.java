import java.lang.*;
import java.util.*;

class FloorSortedArray{

    public static int floorSearch(int[]array, int x){
        if(x >= array.length-1){
            return array.length - 1;
        }
        else if(x < array[0]){
            return -1;
        }
        else{
            for(int i = 1; i < array.length; i++){
                if(array[i] > x){
                    return i - 1;
                }
            }
            return -1;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements : ");
        int n = sc.nextInt();
        int[]array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i <array.length; i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the key element : ");
        int x = sc.nextInt();

        int index = floorSearch(array,x);

        if(index == -1){
            System.out.println("No floor element found");
        }
        else{
            System.out.println("The floor element is : " + array[index]);
        }
        sc.close();
    }
}