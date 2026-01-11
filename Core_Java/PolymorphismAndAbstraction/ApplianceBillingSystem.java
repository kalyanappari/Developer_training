package PolymorphismAndAbstraction;

public class ApplianceBillingSystem {
    public static void main(String args[]){
        Appliance a1=new Appliance("A210","LG CoolFresh","Refrigerator",30000);
        System.out.println("Monthly Rent: "+a1.calculateMonthlyRent());
        System.out.println("Security Deposit: "+a1.calculateDeposit());
    }
}
class Appliance implements RentalCharge,SecurityDeposit{
    private String applianceId;
    private String applianceName;
    private String applianceType;
    private double basePrice;

    Appliance(String applianceId,String applianceName,String applianceType,double basePrice){
        this.applianceId=applianceId;
        this.applianceName=applianceName;
        this.applianceType=applianceType;
        this.basePrice=basePrice;
    }

    public double calculateMonthlyRent(){
        double amt=0;
        if(applianceType.equals("Refrigerator")){
            amt+=basePrice*12/100;
        }else if(applianceType.equals("Wasing Machine")){
            amt+=basePrice*10/100;

        }else if(applianceType.equals("Microwave")){
            amt+=basePrice*8/100;

        }else{
            System.out.println("Wrong Appliance Type");
        }
        return amt;
    }

    public double calculateDeposit(){
        double d=0;
        if(basePrice>=0 &&basePrice<=10000){
            d=1000;
        }else if(basePrice>10000 && basePrice<=25000){
            d=2000;
        }else{
            d=3500;
        }
        return d;
    }
}

interface RentalCharge{
    abstract double calculateMonthlyRent();
}

interface SecurityDeposit{
    abstract double calculateDeposit();
}

