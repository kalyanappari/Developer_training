class A1{

    private void message(){
        System.out.println("Kalyan appari!");
    }

    public void call(){
        message();
    }
}
class A2 extends A1{

    private void message(){
        System.out.println("Nithin Kumar!");
    }

    public void call(){
        message();
    }
}
public class Main1 {

    public static void main(String[] args) {

        A1 obj = new A2();

        obj.call();
    }
}