package PolymorphismAndAbstraction;

public class FoodDeliveryAndBillCalculator {

    public static void main(String[] args){

        OrderCalculator obj = new OrderCalculator();

        obj.calculateBill(250);
        obj.calculateBill(200,3);
        obj.calculateBill(150,4,50);

    }
}
class OrderCalculator{

    public void calculateBill(int price){
        System.out.println("Bill Amount: " + price);
    }
    public void calculateBill(int price,int quantity){
        System.out.println("Bill Amount: " + price * quantity);
    }
    public void calculateBill(int price,int quantity,int deliveryCharge){
        System.out.println("Bill Amount with Delivery: " + (price * quantity + deliveryCharge));
    }
}