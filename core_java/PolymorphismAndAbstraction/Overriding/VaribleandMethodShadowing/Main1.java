package core_java.PolymorphismAndAbstraction.Overriding.VaribleandMethodShadowing;

public class Main1 {

    public static void main(String[] args){

        A1 obj1 = new A2();
        A2 obj2 = new A2();

        obj1.message();
        obj1.message2();
        obj1.call();

        obj2.message3();
        obj2.message();

        System.out.println(obj1.x);
        System.out.println(obj1.y);
        System.out.println(obj1.k);
        System.out.println(obj1.z);

        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.k);
        System.out.println(obj2.z);

    }
}

