
@FunctionalInterface
interface Functional{

    void add(int a,int b);

    static void message(){
        System.out.println("Static method of the fucntional interfaces");
    }
    default void defaultMessage(){
        System.out.println("Dafault Method of the functional Interface");
    }
}
public class Main1 {

    public static void main(String[] args){

        //Creating the anonymous class to implement the fucntional Interface.

        Functional obj = new Functional(){

            public void add(int a,int b){
                System.out.println(a + b);
            }
        };

        obj.add(5,4);

        obj.defaultMessage();

        Functional.message();

        Functional obj1 = (a,b) -> System.out.println(a + b);

        obj1.add(2,3);
    }
}
