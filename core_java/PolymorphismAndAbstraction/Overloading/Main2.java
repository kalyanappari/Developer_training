class B1{

    final void message(){
        System.out.println("Message1");
    }
    final void message(int x){
        System.out.println("Message2 " + x);
    }
}
class B2 extends B1{

    //This is not a method overriding, it a overloading at sub class level through inheritance.
    final void message(int x,int y){
        System.out.println("Message2 " + x + " " + y);
    }
}
public class Main2 {

    public static void main(String[] args){

        B2 obj = new B2();

        obj.message();
        obj.message(20);
        obj.message(30,40);

    }
}
