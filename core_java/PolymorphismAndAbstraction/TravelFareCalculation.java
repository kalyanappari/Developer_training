package PolymorphismAndAbstraction;

public class TravelFareCalculation {
    public static void main(String args[]){
        Transport t1=new Bus(10);
        System.out.println("Bus Fare: "+t1.calculateFare());
        Transport t2=new Taxi(10);
        System.out.println("Taxi Fare: "+t2.calculateFare());

    }
}
abstract class Transport{
    int distance;

    Transport(int distance){
        this.distance=distance;
    }
    abstract double calculateFare();
}

class Bus extends Transport{

    Bus(int distance){
        super(distance);
    }
    
    double calculateFare(){
        return distance*10;
    }
}

class Taxi extends Transport{
    Taxi(int distance){
        super(distance);
    }
    double calculateFare(){
        return distance*25;
    }
}
