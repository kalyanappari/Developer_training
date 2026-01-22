// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface Animal1{
    
    void mes();
    static void message(){
        System.out.println("Static1 kalyan appari!");
    }
    default void mess(){
        System.out.println("Default1 kalyan appari!");
    }
}
interface Animal2{
    
    void mes();
    static void message(){
        System.out.println("Static2 kalyan appari!");
    }
    default void mess(){
        System.out.println("Default2 kalyan appari!");
    }
}
class Dog implements Animal1,Animal2{
    
    public void mes(){
        System.out.println("Kalyan Appari!");
    }
    public void mess(){
        Animal1.super.mess();
    }
}
public class Main2{
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Dog d = new Dog();

        d.mes();
        d.mess();
    }
}