import java.util.function.Function;
public class FunctionFuncInterface {
    public static void main(String[] args) {
        
        Function<String,Integer> f = s -> s.length();

        System.out.println(f.apply("Kalyan"));

        System.out.println(f.apply("Nithin kumar reddy!"));
        
    }
}
