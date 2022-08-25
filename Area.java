import java.lang.*;
import java.util.*;

class Parameters{
    int l;
    int b;
    double len;
    double bred;
    public static int area(int l,int b){
        return l*b;
    }
    public static double area(double len, double bred){
        return len*bred;
    }
    public void setVal(int l,int b, double len, double bred){
        this.l = l; 
        this.b = b;
        this.len = len;
        this.bred = bred;
    }
    public void getVal(){
        System.out.println("Length in Integer : " + l);
        System.out.println("Breadth in Integer : " + b);
        System.out.println("Length in Double : " + len);
        System.out.println("Breadth in Double : " + bred);
    }
}
class Area{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth in integer :");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter the length and breadth in double: ");
        double len = sc.nextDouble();
        double bred = sc.nextDouble();
        Parameters para = new Parameters();
        para.setVal(l,b,len,bred);
        para.getVal();
        System.out.println("Area in integer :" + para.area(l,b));
        System.out.println("Area in double :" + para.area(len,bred));
        sc.close();
    }
}