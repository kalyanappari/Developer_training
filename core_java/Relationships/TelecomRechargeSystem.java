public class TelecomRechargeSystem {

    public static void main(String[] args){

        PremiumRecharge obj = new PremiumRecharge(299,199,50);

        System.out.println("Amount after data pack: " + obj.getAmount());

        System.out.println("Final recharge amount calculated");

        System.out.println("Payable Amount: " +  obj.calculateFinalAmount());
    }
}
class Recharge{

    private int amount;

    Recharge(int amount){
        this.amount = amount;
        System.out.println("Base recharge initialized: " + amount);
    }

    public int getAmount(){
        return amount;
    }
}
class DataRecharge extends Recharge{

    private int amount;

    DataRecharge(int baseAmount,int dataAmount){
        super(baseAmount);
        this.amount = dataAmount;
        System.out.println("Data pack added: " + amount);
    }

    public int getAmount(){
        return amount + super.getAmount();
    }
}
class PremiumRecharge extends DataRecharge{

    private int amount;

    PremiumRecharge(int baseAmount,int dataAmount,int tax){
        super(baseAmount,dataAmount);
        this.amount = tax;
        System.out.println("Service tax added: " + amount);
    }

    public int calculateFinalAmount(){
        return getAmount() + amount;
    }
}