public class PetPalAutonomous{
    public static void main(String args[]){
        FoodDispenser fd1=new FoodDispenser(1000,500,100);
        System.out.println("Current food level: "+fd1.getFoodLevel()+" grams");
        fd1.dispensePortion();
        fd1.dispenseFood(600);
        fd1.refillFood(300);
        System.out.println("Final food level: "+fd1.getFoodLevel()+" grams");
    }
}
class FoodDispenser{
    private int capacity;
    private int foodLevel;
    private int portionSize;
    private int calibration;
    FoodDispenser(int capacity,int foodLevel,int portionSize){
        this.calibration=1;
        this.capacity=capacity;
        this.foodLevel=foodLevel;
        this.portionSize=portionSize;
    }
    public int getFoodLevel(){
        return foodLevel;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getPortionSize(){
        return portionSize;
    }

    public void dispensePortion(){
        System.out.println("Dispensing "+portionSize+" grams of food...");
        if(foodLevel>=portionSize){
            foodLevel-=portionSize;
            System.out.println("Food dispensed successfully. Current food level: "+foodLevel+" grams");
        }else{
            System.out.println("Error: Not enough to dispense "+portionSize+" grams.");
        }
        
       
    }
    public void dispenseFood(int amount){
        System.out.println("Attempting to dispense "+amount+" grams of food...");
        if(foodLevel>=amount){
            System.out.println("Food dispensed successfully. Current food level: "+foodLevel+" grams");
            foodLevel-=amount;
        }else{
            System.out.println("Error: Not enough food to dispense "+amount+" grams.");
        }
        
        
    }
    public void refillFood(int amount){
        System.out.println("Refilling "+amount+" grams of food...");
        if(foodLevel+amount<=capacity){
            foodLevel+=amount;
            System.out.println("Food refilled successfully. Current food level: "+foodLevel+" grams");
        }else{
            System.out.println("Error: Capacity exceeded "+amount+" grams.");
        }

        
    }
}