import java.lang.*;
import java.util.*;

class Circle{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        if(radius < 0){
            radius = 0;
            return radius;
        }
        else{
            return radius;
        }
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
}

class Cylinder extends Circle{
    private double height;

    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public double getHeight(){
        if(height < 0){
            height = 0;
            return height;
        }
        else{
            return height;
        }
    }
    public double getVolume(){
        return getArea()*height;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE DETAILS OF THE CIRCLE");
        System.out.println("Enter the radius of the circle : ");
        double radius = sc.nextDouble();
        Circle c = new Circle(radius);
        System.out.println("The radius of the circle is : " + c.getRadius());
        System.out.println("The area of the circle is: " + c.getArea());
        System.out.println("ENTER THE DETAILS OF THE CYLINDER");
        System.out.println("The radius of the cylinder is same as circle-----");
        System.out.println("Enter the height of the cylinder : ");
        double height = sc.nextDouble();
        Cylinder cy = new Cylinder(radius, height);
        System.out.println("The radius of the cylinder is : " + cy.getRadius());
        System.out.println("The height of the cylinder is  : " + cy.getHeight());
        System.out.println("The volume of the cylinder is  : " + cy.getVolume());
        sc.close();
    }
}
