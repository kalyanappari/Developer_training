public class RideSharingSystem {

    public static void main(String[] args){

        Driver d1 = new Driver("Ramesh");

        Ride r1 = new Ride(101,d1,new Payment(true));

        r1.startRide();

        Ride r2 = new Ride(102,d1,new Payment(true));

        r2.startRide();
    }
}
class Driver{

    private String name;
    private boolean available=true;

    Driver(String name){
        this.name = name;
    }

    public boolean isAvailable(){
        return available;
    }

    public void markUnavailable(){
        available = false;
    }

    public String getName(){
        return name;
    }
}
class Payment{

    private boolean successful;

    Payment(boolean successful){
        this.successful = successful;
    }

    public boolean isSuccessful(){
        return successful;
    }
}
class Ride{

    private int rideId;
    private Driver driver;
    private Payment payment;

    Ride(int rideId,Driver driver,Payment payment){
        this.rideId = rideId;
        this.driver = driver;
        this.payment = payment;
    }

    public void startRide(){

        if(driver.isAvailable() && payment.isSuccessful()){
            System.out.println("Ride " + rideId + " started with driver " + driver.getName());
            driver.markUnavailable();
        }
        else{
            System.out.println("Ride " + rideId + " failed");
        }
    }
}
