/*Bob is a wall painter and he needs your help. You have to write a program that helps Bob calculate how many buckets of paint he needs to buy before going to work. Bob might also have some extra buckets at home. He also knows the area that he can cover with one bucket of paint.

Write a method named getBucketCount with 4 parameters. The first parameter should be named width of type double. This parameter represents the width of the wall.
The second parameter should be named height of type double. This parameter represents the height of the wall.

The third parameter should be named areaPerBucket. This parameter represents the area that can be covered with one bucket of paint.

The fourth parameter should be named extraBuckets. This parameter represents the bucket count that Bob has at home.

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0 or if extraBuckets is less than 0, the method needs to return -1 to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

Examples of input/output:

getBucketCount(-3.4, 2.1, 1.5, 2); → should return -1 since the width parameter is invalid
getBucketCount(3.4, 2.1, 1.5, 2); → should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
getBucketCount(2.75, 3.25, 2.5, 1); → should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.
Bob does not like to enter 0 for the extraBuckets parameter so he needs another method.
Write another overloaded method named getBucketCount with 3 parameters namely width, height, and areaPerBucket (all of type double).

This method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters width, height or areaPerBucket is less or equal to 0, the method needs to return -1 to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

Examples of input/output:

getBucketCount(-3.4, 2.1, 1.5); → should return -1 since the width parameter is invalid
getBucketCount(3.4, 2.1, 1.5); → should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
getBucketCount(7.25, 4.3, 2.35); → should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.
In some cases, Bob does not know the width and height of the wall but he knows the area of a wall. He needs you to write another method.
Write another overloaded method named getBucketCount with 2 parameters namely, area and areaPerBucket (both of type double).

The method needs to return a value of type int that represents the number of buckets that Bob needs to buy before going to work. To calculate the bucket count, refer to the notes below.

If one of the parameters area or areaPerBucket is less or equal to 0, the method needs to return -1to indicate an invalid value.

If all parameters are valid, the method needs to calculate the number of buckets and return it.

Examples of input/output:

getBucketCount(3.4, 1.5); → should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
getBucketCount(6.26, 2.2); → should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
getBucketCount(3.26, 0.75); → should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .
Do your best to help Bob. */

import java.lang.*;
import java.util.*;

class PaintJob{

    //When Bob enters all the details
    public static int getBucketCount(double width, double height, double  areaPerBucket, double extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        double area = width * height;
        double areaWeCanPaint = areaPerBucket * extraBuckets;
        double areaLeftToPaint = area - areaWeCanPaint;

        if(areaLeftToPaint < 0){
            return -1;
        }

        //Math.ceil ->  rounds the specified double value upward and returns it.
        return (int)Math.ceil(areaLeftToPaint / areaPerBucket);
    }

    //When Bob doesnot like to enter 0 for extrabuckets
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }
        double area = width * height;
        return (int)Math.ceil(area / areaPerBucket);
    }

    //If Bob does not know the width and height of the wall but he knows the area of a wall
    public static int getBucketCount(double area, double areaPerBucket){
        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }
        return (int)Math.ceil(area/areaPerBucket);
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("When Bob enters all the details...");
        System.out.println("Enter the width : ");
        double width1 = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height1 = sc.nextDouble();
        System.out.println("Enter the areaPerBucket : ");
        double areaPerBucket1 = sc.nextDouble();
        System.out.println("Enter the extraBuckets : ");
        double extraBuckets1 = sc.nextDouble();
        System.out.println("The number of buckets needed is : " + getBucketCount(width1,height1,areaPerBucket1,extraBuckets1));

        System.out.println("When Bob doesnot like to enter 0 for extrabuckets...");
        System.out.println("Enter the width : ");
        double width2 = sc.nextDouble();
        System.out.println("Enter the height : ");
        double height2 = sc.nextDouble();
        System.out.println("Enter the areaPerBucket : ");
        double areaPerBucket2 = sc.nextDouble();
        System.out.println("The number of buckets needed is : " + getBucketCount(width2,height2,areaPerBucket2));

        System.out.println("If Bob does not know the width and height of the wall but he knows the area of a wall...");
        System.out.println("Enter the area : ");
        double area3 = sc.nextDouble();
        System.out.println("Enter the areaPerBucket : ");
        double areaPerBucket3 = sc.nextDouble();
        System.out.println("The number of buckets needed is : " + getBucketCount(area3, areaPerBucket3));
        sc.close();
    }
}
