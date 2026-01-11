public class ParkingLotSlotAllocation{

    public static void main(String[] args){

        ParkingLot p1 = new ParkingLot(5);
        p1.parkCar(6);
        p1.removeCar(1);
        p1.display();

    }
}
class ParkingLot{

    private int availableSlots;

    ParkingLot(int availableSlots){
        this.availableSlots = availableSlots;
    }

    public void parkCar(int cars){

        if(availableSlots - cars > 0){
            availableSlots -= cars;
        }
        else{
            availableSlots = 0;
            System.out.println("Parking Full");
        }
    }
    public void removeCar(int cars){

        if(cars > 0){
            availableSlots += cars;
        }
    }
    public void display(){
        System.out.println("Available Slots: " + availableSlots);
    }

}