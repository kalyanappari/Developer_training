public class SmartBankSolution{

    public static void main(String[] args){

        System.out.println("Creating BankAccount object for Alice...");
        BankAccount obj1 = new BankAccount(101,"Alice",5000);
        System.out.println();
        System.out.println("Creating BankAccount object for Bob...");
        BankAccount obj2 = new BankAccount(102,"Bob",3000);
        System.out.println();
        obj1.deposit(2000);
        System.out.println();
        obj2.withdraw(1500);
        System.out.println();
        System.out.println("Displaying Account Details:");
        obj1.displayBalance();
        obj2.displayBalance();
    }
}

class BankAccount {

    int accountNumber;
    String accountHolderName;
    double balance;
    double minimumBalance;
    String status;

    BankAccount(int accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        System.out.println("Constructor executed: initialized account details");
    }

    {
        System.out.println("Non-static initializer executed: setting minimum balance if needed");
        this.minimumBalance = 1000;
        this.status = "Active";
    }

    public void deposit(double amount){
        System.out.println("Depositing " + (int)amount + " into " + this.accountHolderName + "'s account..." );
        this.balance += amount;
        System.out.println("Updated Balance for " + this.accountHolderName + ": " + (int)this.balance);
    }
    public void withdraw(double amount){

        if(amount > 0 && (this.balance - amount) > this.minimumBalance){

            System.out.println("Withdrawing " + (int)amount + " from " + this.accountHolderName + "'s account...");
            balance -= amount;
            System.out.println("Updated Balance for " + this.accountHolderName + ": " + (int)this.balance);
        }
    }
    public void displayBalance(){
        System.out.println("Account Number: " + this.accountNumber + ", " + "Holder: " + this.accountHolderName + ", " + "Balance: " + (int)this.balance);
    }
}