/*We have a dog that likes to bark.  We need to wake up if the dog is barking at night!

Write a method shouldWakeUp that has 2 parameters.
1st parameter should be of type boolean and be named barking it represents if our dog is currently barking.
2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.

We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true. In all other cases return false. If the hourOfDay parameter is less than 0 or greater than 23 return false.

Examples of input/output:

shouldWakeUp (true, 1); → should return true
shouldWakeUp (false, 2); → should return false since the dog is not barking.
shouldWakeUp (true, 8); → should return false, since it's not before 8.
shouldWakeUp (true, -1); → should return false since the hourOfDay parameter needs to be in a range 0-23. */

import java.lang.*;
import java.util.*;

class BarkingDog{
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >= 1 && hourOfDay <= 23){
            if((barking == true)&&(hourOfDay < 8 || hourOfDay > 23)){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Barking status :");
        boolean barking = sc.nextBoolean();
        System.out.println("Enter the hour of the day : ");
        int hourOfDay = sc.nextInt();
        boolean shouldWakeUp = shouldWakeUp(barking, hourOfDay);
        if(shouldWakeUp == true){
            System.out.println("Wake Up!");
        }
        else{
            System.out.println("No Need To Wake Up!");
        }
        sc.close();
    }
}