import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsCreation {

    public static void main(String[] args) {

        //First Way.
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> s = list.stream();
        s.forEach(System.out::println);

        //Second way.
        Stream<String> s1 = Stream.of("Kalyan","Nithin","Bhavani");
        s1.forEach(System.out::println);

        //Third Way from Arrays.

        int[] arr = {1,2,3,4,5,6};
        IntStream s2 = Arrays.stream(arr);

        s2.forEach(System.out::println);

        //Fourth way a infinite Stream

        Stream<Integer> s3 = Stream.iterate(1,n->n+1);

        s3.forEach(System.out::println);

    }
}
