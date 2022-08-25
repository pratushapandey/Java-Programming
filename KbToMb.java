/*Create a integer variable kiloBytes and take a input from the user in kiloBytes. Now, create a method named  printMegaBytes(int kiloBytes) and convert the kiloBytes into MegaBYtes.  

For example, if we divide the Kilobytes by 1024 , It will give the Megabytes(MB).  */

import java.lang.*;
import java.util.*;

class Convert{
    int KB;
    public static int Conversion(int KB){
        int MB = KB/1024;
        return MB;
    }
    public void setVal(int KB){
        this.KB = KB;
    }
    public void getVal(){
        System.out.println("KB :" + KB);
    }
}
class KbToMb{
    public static void main(String[]args){
        Convert conversion = new Convert();
        System.out.println("Enter the KB : ");
        Scanner sc = new Scanner (System.in);
        int KB = sc.nextInt();
        conversion.setVal(KB);
        conversion.getVal();
        int MB = conversion.Conversion(KB);
        System.out.println("MB : " + MB);
        sc.close();
    }
}
