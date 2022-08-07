import java.lang.*;
import java.util.*;
import java.text.DecimalFormat;

class KilometerToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        float dist = sc.nextFloat();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(4);
        double miles = (dist * 0.621371);
        System.out.println("The distance in miles is: " + df.format(miles));
        sc.close();
    }
}
