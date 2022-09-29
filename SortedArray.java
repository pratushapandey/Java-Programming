import java.lang.*;
import java.util.*;

class SortedArray{

    public static void printArray(int[]array){
        System.out.println("The array of number is :");
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void sortArray(int[]array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        printArray(array);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in array: ");
        int n = sc.nextInt();

        int[]array = new int[n];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();        
        }

        printArray(array);
        sortArray(array);

        sc.close();
    }
}
