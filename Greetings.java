import java.lang.*;
import java.util.*;

class Greetings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello " + name + ". Have a good day!");

        sc.close();
    }
}
