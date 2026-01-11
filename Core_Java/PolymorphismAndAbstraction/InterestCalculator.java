package PolymorphismAndAbstraction;

public class InterestCalculator {

    public static void main(String[] args){

        SavingsAccount obj = new SavingsAccount(10000);

        obj.calculateInterest();

    }
}
class Account{

    private double balance;

    Account(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void calculateInterest(){
        System.out.printf("Interest (Account): %.1f\n",(0.03 * balance));
    }

}
class SavingsAccount extends Account{

    SavingsAccount(double balance){
        super(balance);
    }

    public void calculateInterest(){
        super.calculateInterest();
        System.out.printf("Interest (Savings Account): %.1f",(0.05 * getBalance()));
    }
}
