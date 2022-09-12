import java.lang.*;
import java.util.*;

class Floor{
    private double width;
    private double height;

    public Floor(double width, double height){
        if(width < 0){
            this.width = 0;
        }
        else{
            this.width = width;
        }
        if(height < 0){
            this.height = 0;
        }
        else{
            this.height = height;
        }
    }
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double getArea(){
        return width * height;
    }
}

class Carpet{
    private double cost;
     public Carpet(double cost){
        if( cost < 0){
            this.cost = 0;
        }
        else{
            this.cost = cost;
        }
     }
     public double getCost(){
        return cost;
     }
}
class Calculator{
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }
}

class CarpetCostCalculator{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width and height of the floor : ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Enter the cost per unit : ");
        double cost = sc.nextDouble();
        Floor fl = new Floor(width,height);
        Carpet cp = new Carpet(cost);
        Calculator cal = new Calculator(fl, cp);
        System.out.println("The width of the floor is : " + fl.getWidth());
        System.out.println("The height of the floor is : " + fl.getHeight());
        System.out.println("The area of the floor is : " + fl.getArea());
        System.out.println("The cost per unit is : " + cp.getCost());
        System.out.println("The total cost of yhe carpet is : " + cal.getTotalCost());
        sc.close();
    }
}