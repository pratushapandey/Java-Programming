/*Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.

Create three different methods as follows:

area(int length) - for calculating the area of the square.
area(int length, int breadth) - for calculating the area of the rectangle.
area(int breadth, double height) - for calculating the area of the triangle. */

import java.lang.*;
import java.util.*;

class Dimensions{
    public static int rec_Area(int length,int breadth){
        return length*breadth;
    }
    public static int sq_Area(int length){
        return length*length;
    }
    public static int tri_Area(int length,double height){
        return (int)(length*height)/2;
    }
}
class AreaThree{
    public static void main(String[]args){
        Dimensions dim = new Dimensions();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth for rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Area of rectangle :" + dim.rec_Area(l,b));
        System.out.println("Enter the side for square:");
        int s = sc.nextInt();
        System.out.println("Area of square :" + dim.sq_Area(s));
        System.out.println("Enter the base and height for triangle:");
        int base = sc.nextInt();
        double height = sc.nextDouble();
        System.out.println("Area of triangle :" + dim.tri_Area(base,height));
        sc.close();
    }
}