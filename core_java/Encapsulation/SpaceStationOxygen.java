public class SpaceStationOxygen{

    public static void main(String[] args){

        OxygenSystem t1 = new OxygenSystem(500,"ACTIVE");
        OxygenSystem t2 = new OxygenSystem(300,"ACTIVE");
        OxygenSystem t3 = new OxygenSystem(200,"INACTIVE");

        t1.addOxygen(400);
        t2.addOxygen(200);
        t3.addOxygen(100);

        t1.consumeOxygen(50);
        t2.deactiveTank();
        t3.activeTank();
        t3.addOxygen(150);
        System.out.println(t1.getTankStatus());
        System.out.println(t2.getTankStatus());
        System.out.println(t3.getTankStatus());

        System.out.println("Total oxygen in station: " + OxygenSystem.getTotalOxygenInStation() + " liters");
        System.out.println("Total tanks created: " + OxygenSystem.getTotalTanks());
    }

}
class OxygenSystem{

    private int tankID;
    private int currentOxygenLevel;
    private int maxCapacity;
    private String status;
    private static int totalOxygenInStation;
    private static int totalTanks;
    private static int nextTankID;

    public OxygenSystem(int maxCapacity,String status){
        this.maxCapacity = maxCapacity;
        this.status = status;
    }

    public void addOxygen(int l){

        if(status.equals("ACTIVE") && (currentOxygenLevel + l <= maxCapacity)){
            currentOxygenLevel += l;
            totalOxygenInStation += currentOxygenLevel;
            System.out.println("Tank " + tankID + " current oxygen: " + currentOxygenLevel + " liters");
        }
        else if(status.equals("INACTIVE")){
            System.out.println("Cannot add oxygen: Tank " + tankID + " is inactive");
        }
    }
    public void consumeOxygen(int l){
        if(status.equals("ACTIVE") && (currentOxygenLevel - l > 0)){
            currentOxygenLevel -= l;
            System.out.println("Tank " + tankID + " consumed " + l + " liters. Current level: " + currentOxygenLevel + " liters");
            totalOxygenInStation -= l;
        }
    }
    public void activeTank(){
        status = "ACTIVE";
        System.out.println("Tank " + tankID + " activated.");
    }
    public void deactiveTank(){
        status = "INACTIVE";
        totalOxygenInStation -= currentOxygenLevel;
        System.out.println("Tank " + tankID + " deactivated. Oxygen removed from station total.");
    }
    public void getcurrentOxygenLevel(){
        System.out.println("Tank " + tankID + " current oxygen: " + currentOxygenLevel);
    }
    public int getMaxCapacity(){
        return maxCapacity;
    }
    public String getTankStatus(){
        return "Tank " + tankID + " status: " + status + ", oxygen: " + currentOxygenLevel + " liters";
    }

    public static int getTotalOxygenInStation(){
        return totalOxygenInStation;
    }
    public static int getTotalTanks(){
        return totalTanks;
    }

    static{
        totalOxygenInStation = 0;
        totalTanks = 0;
    }
    {
        tankID = ++nextTankID;
        totalTanks++;
    }

}
