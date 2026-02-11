import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;
public class PredicateFuncInterface {
    public static void main(String[] args){

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(2));
        System.out.println(isEven.test(10));
        System.out.println(isEven.test(15));

        List<Integer> list = List.of(1,2,3,4,5,6);

    }
}