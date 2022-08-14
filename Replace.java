import java.lang.*;
import java.util.*;
class Replace
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = sc.nextLine();
        String str2 = str1.replace(' ','_');
        System.out.println("The string with spaces replaced by underscores is: " + str2);
        sc.close();
    }
}
