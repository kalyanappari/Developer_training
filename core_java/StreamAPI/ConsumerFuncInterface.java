import java.util.function.Consumer;
public class ConsumerFuncInterface {

    public static void main(String[] args) {
        
        Consumer<Integer> c = System.out::println;

        c.accept(25);
        c.accept(32);
        c.accept(40);

        Consumer<String> c1 = n -> System.out.println(n);

        c1.accept("Kalyan");
        c1.accept("Appari");
        c1.accept("Nithin");

    }
}
