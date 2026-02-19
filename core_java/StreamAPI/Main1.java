import java.util.*;
import java.util.stream.*;
public class Main1 {

    public static void main(String[] args) {

        /*List<Integer> list = List.of(1,2,3,4,5);

        Stream<Integer> s = list.stream();

        //Intermediate Operations.

        //Filtering.
        s.filter(ele -> ele % 2 == 0)
         .forEach(System.out::println);

        //Maping it transform the ele into other values; 
        s = list.stream();
        s.map(ele -> ele + 10).forEach(System.out::println);

        //flatMap, distinct and sorted together.

        List<List<Integer>> l1 = List.of(List.of(11,12,13,11,14,13),List.of(12,15,16,87));

        Stream<List<Integer>> s1 = l1.stream();

        s1.flatMap(ele -> ele.stream()).distinct().sorted().forEach(System.out::println);

        //Peek(). it does not change any value. it just used to look at the element while flowing. mostly used for the logginf and the debuggings.

        s = list.stream();

        s.peek(ele -> System.out.println("Elements before filter: " + ele))
         .filter(ele -> ele % 2 == 0)
         .peek(ele -> System.out.println("Elements after applying filter: " + ele))
         .forEach(System.out::println);

        //Limit and skip.
        //Limit -> takes only first n elements.
        //Skip - > skips first n elements.

        //a simple limit on stream.

        s = list.stream();

        s.limit(2).forEach(System.out::println);*/

        //Limit with filter.

        List<String> l2 = List.of("Kalyan","Nithin","Bhavani","Ranga","Sriram");

        Stream<String> s2 = l2.stream();

        s2.filter(word -> word.length() > 5)
          .peek(System.out::println)
          .skip(2)
          .map(word -> word.toUpperCase())
          .limit(2)
          .forEach(System.out::println);
    }
}
