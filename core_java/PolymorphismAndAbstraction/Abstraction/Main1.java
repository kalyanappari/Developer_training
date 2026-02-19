class A1{

    {
        System.out.println("Parent Non Static!");
    }
    static{
        System.out.println("Parent Static");
    }

    A1(){
        System.out.println("Parent Constructor!");
    }
}
class B1 extends A1{

    {
        System.out.println("Child Non Static");
    }

    static{
        System.out.println("Child Static Method");
    }

    B1(){
        System.out.println("Child Constructor!");
    }
}
public abstract class Main1 {

    public static void main(String[] args) {
        
        System.out.println("A Main Class Can be abstract!!");

        B1 obj = new B1();
    }
}
