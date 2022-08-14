import java.lang.*;
import java.util.*;
class Lower_Case
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out .println("Enter the string: ");
        String str1 = sc.nextLine();
        String str2 = str1.toLowerCase();
        System.out.println("The lowercase of string is: " + str2);

        sc.close();
    }
}