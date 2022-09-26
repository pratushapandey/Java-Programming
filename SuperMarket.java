import java.io.FilterInputStream;
import java.lang.*;
import java.util.*;

class ShoppingList{
    public static String List(int item_code){
        String item_name= " ";
        switch(item_code){
            case 1:
            item_name = "Fruits";
            System.out.println("Item name is : " + item_name);
            return item_name;

            case 2:
            item_name = "Veggies";
            System.out.println("Item name is : " + item_name);
            return item_name;

            case 3:
            item_name = "Bevarages";
            System.out.println("Item name is : " + item_name);
            return item_name;

            case 4: 
            item_name = "Oils";
            System.out.println("Item name is : " + item_name);
            return item_name;

            case 5:
            item_name = "Spices";
            System.out.println("Item name is : " + item_name);
            return item_name;

            case 6:
            item_name = "Drinks";
            System.out.println("Item name is : " + item_name);
            return item_name;

            default:
            System.out.println("Wrong item selected");
            break;
        }
        return item_name;
    }
}

class ShoppingCart extends ShoppingList{
    public static double price(String item_name){
        double price = 0;
        if(item_name == "Fruits"){
            price = 45.75;
        }
        else if(item_name == "Veggies"){
            price = 35.67;
        }
        else if(item_name == "Bevarages"){
            price = 60.48;
        }
        else if(item_name == "Oils"){
            price = 120.39;
        }
        else if(item_name == "Spices"){
            price = 97.56;
        }
        else if(item_name == "Drinks"){
            price = 105.69;
        }
        return price;
    }
}

class Wallet extends ShoppingCart{
    double wallet_balance = 70.50;

    public void bill(double item_price){
        if(item_price < wallet_balance){
            System.out.println("Thanks for purchase !");
            updateBalance(item_price);
        }
        else if(item_price > wallet_balance){
            System.out.println("Low Balance");
            double amount_recharge = item_price - wallet_balance;
            System.out.println("Please recharge your wallet with : " + amount_recharge + " rupees");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the amount you want to recharge : ");
            double amount = sc.nextDouble();
            recharge(amount);
            updateBalance(item_price);
            sc.close();
        }
    }

    public static void balance(){
        double balance = 0.0;
        System.out.println("Your balance is : " + balance);
    }
    public void recharge(double amount){
        wallet_balance += amount;
        System.out.println("Thanks for recharging");
        System.out.println("Your current balance is : " + wallet_balance);
        bill(wallet_balance);

    }
    public void updateBalance(double item_price){
        wallet_balance -= item_price;
        System.out.println("Your updated wallet balance after purchase is : " + wallet_balance);
    }
}

class SuperMarket{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose the item ....");
        System.out.println("-------------------------------------------");
        System.out.println("Code - 1 : Fruits");
        System.out.println("Code - 2 : Veggies");
        System.out.println("Code - 3 : Bevarages");
        System.out.println("Code - 4 : Oils");
        System.out.println("Code - 5 : Spices");
        System.out.println("Code - 6 : Drinks");
        System.out.println("Enter your choice:");
        int item_code = sc.nextInt();
        Wallet obj = new Wallet();
        String item_name = obj.List(item_code); 
        double price  = obj.price(item_name);
        obj.bill(price);
        sc.close();
    }
}