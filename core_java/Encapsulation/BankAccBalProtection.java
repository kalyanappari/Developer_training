public class BankAccBalProtection{

    public static void main(String[] args){

        BankAccount b1 = new BankAccount(1111,5000);

        b1.deposit(2000);

        b1.withdraw(1000);

        b1.display();
    }
}
class BankAccount{

    private int accountNumber;
    private int balance;

    BankAccount(int accountNumber,int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(int amount){

        if(amount > 0){
            balance += amount;
        }

    }
    public void withdraw(int amount){
        
        if(amount > 0 && (balance - amount != 0)){
            balance -= amount;
        }
    }
    public void display(){
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}