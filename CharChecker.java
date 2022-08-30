import java.lang.*;
import java.util.*;

class CharChecker {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);
        switch(ch){
            case 'a' : case 'A' :
            case 'e' : case 'E' :
            case 'i' : case 'I' :
            case 'o' : case 'O' :
            case 'u' : case 'U' :
            System.out.println("The character you entered is a vowel");
            break;
            default :
            System.out.println("The character you entered is not a vowel");
        }
        sc.close();
    }
}