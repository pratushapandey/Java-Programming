import java.lang.*;
import java.util.*;

class CircleOopsConcept{
    private float radius, area, circumference;
    
    void setRadius(float r){
        radius = r;
    }
    void setArea(float a){
        if(a == 22*radius*radius/7){
            area = a;
        }
        else{
            System.out.println("Invalid area");
        }
    }

    void setCircumference(float c){
        if(c == 2*22*radius/7){
            circumference = c;
        }
        else{
            System.out.println("Invalid circumference");
        }
    }
    float getRadius(){
        return radius;
    }

    float getArea(){
        return area;
    }

    float getCircumference(){
        return circumference;
    }

    public static void main(String[]args){
        CircleOopsConcept circle = new CircleOopsConcept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle : ");
        float r = sc.nextFloat();
        circle.setRadius(r);
        circle.setArea(22*r*r/7);
        circle.setCircumference(2*22*r/7);
        System.out.println("Area : " + circle.getArea() + "sq.cm");
        System.out.println("Circumference : " + circle.getCircumference() + "cm");
        sc.close();
    }
}