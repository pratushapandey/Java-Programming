import java.lang.*;
import java.util.*;
class ReplaceWithName
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Name:");
        String str1 = sc.nextLine();
        String str = "Dear <|name|>, Thanks a lot!";
        str = str.replace("|name|",str1);
        System.out.println(str);
        sc.close();
    }
}