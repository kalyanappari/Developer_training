import java.sql.Date;
public class CityBank {

    public static void main(String[] args) {

        Customer customer1 = new Customer(101, "John Smith", "johnsmith@example.com");
        Customer customer2 = new Customer(102, "Rita", "rita@example.com");

        Account account1 = new Account(5001, 2500.50, customer1);
        BankManagementSystem.totalAccounts++;

        Account account2 = new Account(5002, 3200.50, customer2);
        BankManagementSystem.totalAccounts++;

        Transaction transaction1 =
                new Transaction(9001, account1, 500.00, Date.valueOf("2025-10-23"));
        BankManagementSystem.totalTransactions++;

        Transaction transaction2 =
                new Transaction(9002, account2, 700.00, Date.valueOf("2025-11-25"));
        BankManagementSystem.totalTransactions++;

        BankManagementSystem.displayBankInfo();
        System.out.println();
        customer1.displayCustomerInfo();
        System.out.println();
        account1.displayAccountInfo();
        System.out.println();
        System.out.println();
        transaction1.displayTransactionInfo();
    }
}

class Customer{
    private  int customerID;
    private  String name;
    private  String email;
    Customer(int customerID,String name,String email){
        this.customerID=customerID;
        this.name=name;
        this.email=email;
    }
    public void displayCustomerInfo(){
        System.out.println("\nCustomer Information:");
        System.out.println("Customer ID: " + customerID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

class Account{
    private int accountNumber;
    private double balance;
    private Customer customer;

    {
        balance=0;
    }
    Account(int accountNumber,double balance,Customer customer){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customer=customer;
    }
    Account(int accountNumber,Customer customer){
        this.accountNumber=accountNumber;
        this.customer=customer;
    }
    
    public void displayAccountInfo(){
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: %.2f" , balance);
    }

    // public boolean equals(Object obj){
        
    // }

    // public int hashCode(){
    //     return accountNumber;
    // }

    // public Account clone(){

    // }

    // public void finalize(){
        
    // }

}

class Transaction{
    private int transactionID;
    private Account account;
    private double amount;
    private Date date;

    Transaction(int transactionID,Account account,double amount,Date date){
        this.transactionID=transactionID;
        this.account=account;
        this.amount=amount;
        this.date=date;
    }
    Transaction(int transactionID,Account account){
        this.transactionID=transactionID;
        this.account=account;
    }
    public void displayTransactionInfo() {
        System.out.println("\nTransaction Information:");
        System.out.println("Transaction ID: " + transactionID);
        System.out.printf("Amount: %.2f" , amount);
        System.out.println("\nDate: " + date);
    }
}

class BankManagementSystem{
    static String bankName;
    static int totalAccounts;
    static int totalTransactions;

    public static void displayBankInfo(){
        System.out.println("Bank Name: " + bankName);
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Transactions: " + totalTransactions);
    }

    static{
        bankName="City Bank";
        totalAccounts=0;
        totalTransactions=0;
    }

}