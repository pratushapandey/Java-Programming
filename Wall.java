import java.lang.*;
import java.util.*;

class WallDim{
    private double width;
    private double height;

    // DEFAULT VALUES
    public WallDim(){
    }

    // PARAMETERS TAKEN
    public WallDim(double width, double height){
        if(width < 0 ){
            width = 0;
        }
        if(height < 0 ){
            height = 0;
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double width){
        if(width < 0){
            width = 0;
        }
        this.width = width;
    }

    public void setHeight(double height){
        if(height < 0){
            height = 0;
        }
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }
}

class Wall{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width of the wall : ");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the wall :");
        double height = sc.nextDouble();
        WallDim wallDimension1 = new WallDim();
        System.out.println("The width of the wall is : " + wallDimension1.getWidth());
        System.out.println("The height of the wall is : " + wallDimension1.getHeight());
        System.out.println("The area of the wall is : " + wallDimension1.getArea());
        WallDim wallDimension2 = new WallDim(width, height);
        System.out.println("The width of the wall is : " + wallDimension2.getWidth());
        System.out.println("The height of the wall is : " + wallDimension2.getHeight());
        System.out.println("The area of the wall is : " + wallDimension2.getArea());
        sc.close();
    }
}