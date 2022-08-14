import java.lang.*;
import java.util.*;

class WebsiteChecker {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website: ");
        String website = sc.nextLine();
        if(website.endsWith(".com"))
        {
            System.out.println("Commercial Website");
        }
        else if (website.endsWith(".org"))
        {
            System.out.println("Organization Website");
        }
        else if(website.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
        else
        {
            System.out.println("Out of scope");
        }
        sc.close();
    }
}