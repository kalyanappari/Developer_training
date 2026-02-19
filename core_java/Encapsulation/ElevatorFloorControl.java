public class ElevatorFloorControl{
    public static void main(String args[]){
        Elevator e1=new Elevator(9);
        e1.moveUp();
        e1.moveUp();
        e1.moveDown();
        System.out.println("Current Floor: "+e1.getCurrentFloor());

    }
}
class Elevator{
    private int currentFloor;

    Elevator(int currentFloor){
        this.currentFloor=currentFloor;
    }
    public int getCurrentFloor(){
        return currentFloor;
    }
    public void moveUp(){
        if(currentFloor<10){
            currentFloor++;
        }else{
            System.out.println("Already at top floor");
        }
    }
    public void moveDown(){
        if(currentFloor>1){
            currentFloor--;
        }else{
            System.out.println("Already at ground floor");
        }
    }
}