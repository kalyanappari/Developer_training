public class MobileAndSimManagement {

    public static void main(String[] args){

        SIM s1 = new SIM(9876543210l);

        MobilePhone m1 = new MobilePhone("Samsung",s1);

        m1.display();
    }
}

class SIM{

    private long number;

    SIM(long number){
        this.number = number;
    }

    public long getNumber(){
        return number;
    }
}
class MobilePhone{

    private String brand;
    private SIM sim;

    MobilePhone(String brand,SIM sim){
        this.brand = brand;
        this.sim = sim;
    }

    public void display(){
        System.out.println(brand + " with SIM " + sim.getNumber());
    }
}
