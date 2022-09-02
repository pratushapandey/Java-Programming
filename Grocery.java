import java.lang.*;
import java.util.*;

class GroceryMart{
    private String CustomerName;
    private String CustomerId;
    private String CustomerPhone;
    private String CustomerAddress;
    private Double CustomerBalance;

    public void setCustomerName(String CustomerName){
        this.CustomerName = CustomerName;
    }
    public String getCustomerName(){
        return CustomerName;
    }
    public void setCustomerId(String CustomerId){
        this.CustomerId = CustomerId;
    }
    public String getCustomerId(){
        return CustomerId;
    }
    public void setCustomerPhone(String CustomerPhone){
        this.CustomerPhone = CustomerPhone;
    }
    public String getCustomerPhone(){
        return CustomerPhone;
    }
    public void setCustomerAddress(String CustomerAddress){
        this.CustomerAddress = CustomerAddress;
    }
    public String getCustomerAddress(){
        return CustomerAddress;
    }
    public void setCustomerBalance(Double CustomerBalance){
        this.CustomerBalance = CustomerBalance;
    }
    public Double getCustomerBalance(){
        return CustomerBalance;
    } 
    public void Shop(double amount){
        if(CustomerBalance >= amount){
            double remainingBalance = CustomerBalance - amount;
            System.out.println("Thanks for shopping.Your remaining balance is " + remainingBalance);
            CustomerBalance = remainingBalance; 
        }
        else{
            System.out.println("You,have insufficient balance kindly recharge your account.");
        }
    }
    public void rechargeAccount(double recharge){
        CustomerBalance += recharge;
        System.out.println("Thanks for recharging.Your current balance is : " + CustomerBalance);
    }
}

class Grocery{
    public static void main(String[]args){
        GroceryMart myAccount = new GroceryMart();
        Scanner sc = new Scanner(System.in);
        System.out.println("Customer Name : ");
        String CustomerName = sc.nextLine();
        System.out.println("Customer Id : ");
        String CustomerId = sc.nextLine();
        System.out.println("Customer Phone : ");
        String CustomerPhone = sc.nextLine();
        System.out.println("Customer Address : ");
        String CustomerAddress = sc.nextLine();
        System.out.println("Customer Balance : ");
        Double CustomerBalance = sc.nextDouble();
        System.out.println("Total amount shopping done : ");
        Double Amount = sc.nextDouble();
        myAccount.setCustomerName(CustomerName);
        myAccount.setCustomerId(CustomerId);
        myAccount.setCustomerPhone(CustomerPhone);
        myAccount.setCustomerAddress(CustomerAddress);
        myAccount.setCustomerBalance(CustomerBalance);

        if(CustomerBalance >= Amount){
            myAccount.Shop(Amount);
        }
        else{
            System.out.println("Enter the amount to recharge your account :");
            double recharge = sc.nextDouble();
            myAccount.rechargeAccount(recharge);
            double rechargeBal = CustomerBalance + recharge;
            double result = rechargeBal - Amount;
            System.out.println("Now,the remaining balance is : " + result);
        }
        sc.close();
    }
}