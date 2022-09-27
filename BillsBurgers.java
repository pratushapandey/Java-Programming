import java.lang.*;
import java.util.*;

class BillsBurgers{
    public static void main(String[]args){
        int VegetableBurgerCost = 45 * 4;
        int VegetableMcPuffsCost = 25 * 3;
        System.out.println("Burger costed :" + VegetableBurgerCost);
        System.out.println("Mc Puffs costed :" + VegetableMcPuffsCost);
        
        int totalCost = VegetableBurgerCost + VegetableMcPuffsCost;
        System.out.println("The total cost of the meal is : " + totalCost);

        int reducedCost = totalCost - 50;
        System.out.println("Independence Day offer going on, of reduction of Rs.50 from final balance------");
        System.out.println("After reduction your price is : " + reducedCost);
    }
}