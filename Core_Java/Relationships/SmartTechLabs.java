public class SmartTechLabs{
    public static void main(String args[]){
        Smartphone s1=new Smartphone();
        Smartphone s2=new Smartphone();
        s1.setModel("Galaxy S24");
        s1.setCapacity(5000);
        s2.setModel("iPhone 16");
        s2.setCapacity(4200);

        s1.displaySmartphone();
        s2.displaySmartphone();
    }
}

class Battery {
    private int capacity;

    void displayBattery(){
        System.out.println("Battery capacity: "+capacity+"mAh");
    }

    public void setCapacity(int capacity){
        this.capacity=capacity;
    }

}

class Smartphone {
    private String model;
    private Battery battery;

    Smartphone(){
        this.battery=new Battery();
    }
    public String getModel(){
        return model;
    }

    public void setModel(String model){
        this.model=model;
    }

    public void setCapacity(int capacity){
        this.battery.setCapacity(capacity);
    }

    public void displaySmartphone(){
        System.out.println("Phone model: "+this.model);
        this.battery.displayBattery();
    }  

}

