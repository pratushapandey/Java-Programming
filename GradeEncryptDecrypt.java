import java.lang.*;
import java.util.*;

class GradeEncryptDecrypt{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch = sc.next().charAt(0);

        // Encrypting the character
        ch = (char)(ch + 8);
        System.out.println("The encrypted character is : " + ch);

        // Decrypting the character
        ch = (char)(ch - 8);
        System.out.println("The decrypted character is : " + ch);
        sc.close();
    }
}
