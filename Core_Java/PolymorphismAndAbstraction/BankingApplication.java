package PolymorphismAndAbstraction;

public class BankingApplication {
    public static void main(String args[]){
        BankAccount ba1=new BankAccount(1001);
        BankAccount ba2=new BankAccount(1002,5000);
        BankAccount ba3=new BankAccount(1003,10000,"Current");

        ba1.displayAccountDetails();
        System.out.println();
        ba2.displayAccountDetails();
        System.out.println();
        ba3.displayAccountDetails();
    }
}

class BankAccount{
    int accountNumber;
    double balance;
    String accountType;

    BankAccount(int accountNumber){
        this.accountNumber=accountNumber;
        balance=0;
        accountType="Savings";
    }
    BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
        accountType="Savings";
    }
    BankAccount(int accountNumber,double balance,String accountType){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.accountType=accountType;
    }

    public void displayAccountDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        System.out.println("Account Type: "+accountType);
    }
}