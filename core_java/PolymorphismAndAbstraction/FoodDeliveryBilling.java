package PolymorphismAndAbstraction;

public class FoodDeliveryBilling {

    public static void main(String[] args){

        Order o1 = new RegularOrder(3500);
        System.out.println("Regular Customer Bill: " + o1.calculateBill() + " rs");

        Order o2 = new PremiumOrder(3500);
        System.out.println("Premium Customer Bill: " + o2.calculateBill() + " rs");

        Order o3 = new CorporateOrder(3500);
        System.out.println("Corporate Customer Bill: " + o3.calculateBill()+ " rs");
    }
}
abstract class Order{

    private double baseAmount;

    Order(double baseAmount){
        this.baseAmount = baseAmount;
    }

    public double getBaseAmount(){
        return baseAmount;
    }

    abstract double calculateBill();
}
class RegularOrder extends Order{

    RegularOrder(double baseAmount){
        super(baseAmount);
    }

    double calculateBill(){
        return 0.05 * getBaseAmount() + getBaseAmount();
    }
}
class PremiumOrder extends Order{

    PremiumOrder(double baseAmount){
        super(baseAmount);
    }

    double calculateBill(){

        double bill = 0.05 * getBaseAmount() + getBaseAmount();

        double dis = 0.1 * bill;

        bill -= dis;

        if(bill > 3000){
            bill -= 200;
        }

        return bill;
    }
}
class CorporateOrder extends Order{

    CorporateOrder(double baseAmount){
        super(baseAmount);
    }
    double calculateBill(){

        double bill = (0.05 * getBaseAmount()) + getBaseAmount();

        double dis = 0.15 * bill;

        bill -= dis;

        if(bill > 3000){
            bill -= 300;
        }
        return bill;
    }
}