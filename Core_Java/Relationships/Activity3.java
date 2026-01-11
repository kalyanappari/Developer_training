public class Activity3{

    public static void main(String[] args){

        FoodItem f1 = new FoodItem(101,"Margherita Pizza","Classic cheese pizza",400.00,"Pizza","pizza.jpg",true,"2025-10-23");
        FoodItem f2 = new FoodItem(102,"Veg Burger","Loaded with veggies",250.00,"Burger","burger.jpg",true,"2025-10-23");

        Order obj = new Order(301,"Olivia Davis","PAID",0.05,f1,f2,new Invoice(801,"INV-2025-03","invoice_801.pdf","2025-10-23"));

        obj.setTotalAmount();

        obj.displayOrderInfo();
    }
}

class FoodItem{

    private int ID;
    private String name;
    private String description;
    private double price;
    private String category;
    private String image_url;
    private boolean isActive;
    private String createdDate;

    FoodItem(int ID,String name,String description,double price,String category,String image_url, boolean isActive,String createdDate){
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.image_url = image_url;
        this.isActive = isActive;
        this.createdDate = createdDate;
    }

    public double getPrice(){
        return price;
    }

    public void displayFoodItem(){
        System.out.printf("%s - %.2f (%s)",name,price,category);
    }
}

class Invoice{

    private int id;
    private String num;
    private String pdf_url;
    private String generated_date;

    Invoice(int id,String num,String pdf_url,String generated_date){
        this.id = id;
        this.num = num;
        this.pdf_url = pdf_url;
        this.generated_date = generated_date;
    }

    public void displayInvoice(){

        System.out.println("Invoice ID: " + id);
        System.out.println("Invoice Number: " + num);
        System.out.println("PDF URL: " + pdf_url);
        System.out.println("Generated Date: " + generated_date);
    }
}

class Order{

    private int id;
    private String name;
    private String status;
    private double subtotal;
    private double taxRate;
    private double taxamount;
    private double totalamount;

    private Invoice invoice;
    private FoodItem f1;
    private FoodItem f2;

    Order(int id,String name,String status,double taxRate,FoodItem f1,FoodItem f2,Invoice invoice){
        this.id = id;
        this.name = name;
        this.status = status;
        this.taxRate = taxRate;
        this.f1 = f1;
        this.f2 = f2;
        this.invoice = invoice;
    }

    public void setTotalAmount(){
        subtotal = f1.getPrice() + f2.getPrice();
        taxamount = taxRate * subtotal;
        totalamount = subtotal + taxamount;
    }

    public void displayOrderInfo(){

        System.out.println("Order ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Status: " + status);
        System.out.printf("Subtotal: %.2f\n",subtotal);
        System.out.printf("Tax Rate: %.2f\n",taxRate);
        System.out.printf("Tax Amount: %.2f\n",taxamount);
        System.out.printf("Total Amount: %.2f\n",totalamount);

        System.out.println();
        System.out.println("Food Items:");
        System.out.print("1. ");
        f1.displayFoodItem();
        System.out.println();
        System.out.print("2. ");
        f2.displayFoodItem();

        System.out.println("\n");
        invoice.displayInvoice();
    }
}