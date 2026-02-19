//Serializability with ObjectStreams.

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.EOFException;
class Customer implements Serializable{

    String customerName;

    Customer(String customeString){
        this.customerName = customeString;
    }
}
class Account implements Serializable{

    long accountNumber;
    Customer customer;
    double balance;
    int pin;
    Account(long accountNumber,Customer customer,double balance,int pin){
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
        this.pin = pin;
    }

    public void deposit(double amount){

        if(amount > 0){
            balance += amount;
        }
    }
    public void withdraw(double amount){

        if((balance - amount) > 0){
            balance -= amount;
        }
    }
    public String toString(){
        return "Account No: " + accountNumber + ", Name: " + customer.customerName + ", Balance: " + balance + ", PIN: 0";
    }
}
class AccountFileManager{

    String filePath = "objects.ser";

    public void serializeAccount(List<Account> list){

        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream(filePath,true))){

            for(int i=0;i<list.size();i++){
                Account ac = list.get(i);
                obj.writeObject(ac);
                System.out.println("Account saved: " + ac.accountNumber);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }

    }
    public void deserializeAccount(long accountNumber){

        try(ObjectInputStream obj = new ObjectInputStream(new FileInputStream(filePath))){

            while(true){

                Account account = (Account) obj.readObject();

                if(account.accountNumber == accountNumber){
                    System.out.println("Restored Account:");
                    System.out.println(account);
                    account.deposit(2000);
                    account.withdraw(3000);
                    System.out.println();
                    System.out.println("After Transactions:");
                    System.out.println(account.toString());
                }
            }
        }
        catch(EOFException e){

        }
        catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
public class SecureBankingSystem {
    public static void main(String[] args) {

        Customer c1 = new Customer("Rohit");
        Customer c2 = new Customer("Anjali");

        Account acc1 = new Account(50001,c1, 10000, 1234);
        Account acc2 = new Account(50002,c2,25000,5678);

        AccountFileManager am = new AccountFileManager();

        List<Account> list = new ArrayList<>();

        list.add(acc1);
        list.add(acc2);

        System.out.println();
        am.serializeAccount(list);
        System.out.println();
        am.deserializeAccount(50001);
    }
}
