public class TransportDriver {

    public static void main(String[] args){

        CityDriver c1 = new CityDriver("Ramesh","CITY123");

        HighwayDriver h1 = new HighwayDriver("Suresh","HIGHWAY456");

        c1.commonDuty();
        c1.duty();

        h1.commonDuty();
        h1.duty();
    }
}
class Person{

    private String name;

    Person(String name){
        this.name = name;
        System.out.println("Person registered: " + name);
    }

    public String getName(){
        return name;
    }
}
class Driver extends Person{

    private String license;

    Driver(String name,String license){
        super(name);
        this.license = license;
        System.out.println("Driver licensed: " + license);
    }

    public void commonDuty(){
        System.out.println(getName() + " is checking vehicle");
    }
}
class CityDriver extends Driver{

    CityDriver(String name,String license){
        super(name,license);
    }

    public void duty(){
        System.out.println(getName() + " driving in city traffic");
    }
}
class HighwayDriver extends Driver{

    HighwayDriver(String name,String license){
        super(name,license);
    }

    public void duty(){
        System.out.println(getName() + " driving on highway");
    }
}