import java.lang.*;
import java.util.*;

class Casting{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three variables : ");
        int a = sc.nextInt();
        byte b = sc.nextByte();
        short c = sc.nextShort();
        long res = 1000*(a+b+c);
        System.out.println("Result Long:" + res);
        short result = (short)(1000*(a+b+c));
        System.out.println("Result Short:" + result);
        sc.close();
    }
}