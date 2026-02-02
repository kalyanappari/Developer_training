import java.util.*;
import java.util.stream.*;
public class Main2{

    public static void main(String[] args){

        List<String> list = List.of("Kalyan","Nithin","App","Cdfg","Fucntion","Kalyan","Nithin");

        List<String> res = list.stream()
                               .filter(word -> word.length() > 5)
                               .map(word -> word.toUpperCase())
                               .collect(Collectors.toList());

        /*🔹 Simple Definition
        Collectors is a helper class that provides ready-made implementations of the Collector interface, used by the 
        collect() terminal operation to convert a Stream into a final result.*/
        System.out.println(res);
        //ToSet.
        Set<String> res1 = list.stream()
                               .filter(word -> word.length() > 5)
                               .map(word -> word.toUpperCase())
                               .collect(Collectors.toSet());

        LinkedHashSet<String> set = new LinkedHashSet<>(res1);
        System.out.println(set);
        System.out.println(res1);

        //Collecting to the map.

        Map<String,String> map = list.stream().distinct().map(word -> word.toUpperCase()).collect(Collectors.toMap(word -> word,word -> word.toLowerCase()));

        System.out.println(map);

        //Reduce. combines all the values into the single with custom operation.

        Stream<Integer> st = Stream.of(1,2,3,4,5);

        Optional<Integer> result = st.reduce((a,b)-> a * b);

        System.out.println(result.get());

        //Here 1 gaurentees the result int. so it doesn't requires any optional class.
        /*int res2 = st.reduce(1,(a,b)-> a * b);

        System.out.println(res2);*/

        //Count.

        Stream<Integer> st2 = Stream.of(1,2,3,4,5);
        
        long evenCount = st2.filter(n -> n%2 == 0).count();

        System.out.println(evenCount);
    }
}
