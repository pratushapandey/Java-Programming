import java.lang.*;
import java.util.*;

class Rectangle{
    private double length;
    private double width;

    Rectangle(){

    }

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public double getLength(){
        if(length < 0){
            length = 0;
            return length;
        }
        else{
            return length;
        }
    }
    public double getWidth(){
        if(width < 0){
            width = 0;
            return width;
        }
        else{
            return width;
        }
    }
    public double getArea(){
        return length * width;
    }
}

class Cuboid extends Rectangle{
    double height;
    Rectangle rectangle;

    Cuboid(Rectangle rectangle, double height){
        if(height < 0){
            this.height = 0;
        }
        else{
            this.height = height;
            this.rectangle = rectangle;
        }
    }
    public double getHeight(){
        return height;
    }
    public double getVolume(){
        return rectangle.getArea()* getHeight();
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE DETAILS OF THE RECTANGLE");
        System.out.println("Enter the length of the rectangle : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width of the rectangle : ");
        double width = sc.nextDouble();
        Rectangle r = new Rectangle(length,width);
        System.out.println("The length of the rectangle is : " + r.getLength());
        System.out.println("The width of the rectangle is : " + r.getWidth());
        System.out.println("The area of the rectangle is: " + r.getArea());
        System.out.println("ENTER THE DETAILS OF THE CUBOID");
        System.out.println("The length,width of the cuboid is same as rectangle-----");
        System.out.println("Enter the height of the cuboid : ");
        double height = sc.nextDouble();
        Cuboid c = new Cuboid(r, height);
        System.out.println("The radius of the cuboid is : " + c.rectangle.getLength());
        System.out.println("The radius of the cuboid is : " + c.rectangle.getWidth());
        System.out.println("The height of the cuboid is  : " + c.getHeight());
        System.out.println("The volume of the cuboid is  : " + c.getVolume());
        sc.close();
    }
}