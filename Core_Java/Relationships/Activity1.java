public class Activity1{
    public static void main(String args[]){
        Payment p= new Payment(101,1500.50,"UPI","SUCCESS","2025-10-23");
        
        Order o1=new Order(501,"John Carter",1500.50,p);
        o1.displayOrderInfo();
    }
}
class Payment{
    private int id;
    private double amount;
    private String method;
    private String status;
    private String created_at;

    Payment(int id,double amount,String method, String status,String created_at){
        this.id=id;
        this.amount=amount;
        this.method=method;
        this.status=status;
        this.created_at=created_at;
    }
    public void displayPaymentInfo(){
        System.out.println("Payment ID: "+id);
        System.out.printf("Amount: %.2f",amount);
        System.out.println();
        System.out.println("Method: "+method);
        System.out.println("Status: "+status);
        System.out.println("Date: "+created_at);
    }

}
class Order{
    private int id;
    private String customerName;
    private double totalAmount;
    private Payment payment;

    Order(int id,String customerName,double totalAmount,Payment payment){
        this.payment=payment;
        this.id=id;
        this.customerName=customerName;
        this.totalAmount=totalAmount;
    }
    
    public void displayOrderInfo(){
        System.out.println("Order ID: "+id);
        System.out.println("Customer Name: "+customerName);
        System.out.printf("Total Amount: %.2f",totalAmount);
        System.out.println();
        System.out.println();
        payment.displayPaymentInfo();
    }
}