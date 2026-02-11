@FunctionalInterface
interface Operations{
    public abstract int add(int a,int b);

    public static void message(){
        System.out.println("Kalyan");
    }

    default void mess(){
        System.out.println("Kalyan1");
    }
}
class op implements Operations{

    public int add(int a,int b){
        return a + b;
    }
}
public class Main3 {

    public static void main(String[] args) {

        //Anonymous classes.

        Operations obj = new Operation(){

            int add(int a,int b){
                return a + b;
            }
        };

        int res = obj.add(2,4);

        System.out.println(res);

        //Lambda Expressions.

        Operations obj1 = (a,b) -> a + b;

        System.out.println(obj1.add(3,4));

        obj1.message();

        obj1.mess();

        Operations.message();

    }

}
