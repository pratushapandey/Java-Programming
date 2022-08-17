import java.lang.*;
import java.util.*;

class CheckIntegerInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int [] num =new int [n];
        System.out.println("Enter the elements in array : ");
        int i;
        for(i = 0; i < num.length; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched :");
        int element = sc.nextInt();
        boolean found = false;
        for(i = 0; i<num.length;i++){
            if(element == num[i])
            {
                found = true;
                break;
            }
            i++;
        }
        if(found){
            System.out.println("Element found at index : " + i);
        }
        else{
            System.out.println("Element not found");
        }
        sc.close();
    }
}