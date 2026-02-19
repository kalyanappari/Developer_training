import java.util.*;
public class Main1 {

    public static void main(String[] args){

        HashSet<String> hs = new HashSet<>();

        hs.add("Kalyan");
        hs.add("Billa");
        hs.add("pilla");
        hs.add("Nithin");
        hs.add("Sri ram");

        System.out.println(hs);

        //Iteration using the iterator.

        Iterator<String> itr = hs.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
            //itr.remove();
        }
        System.out.println(hs);

        //Iteration using the iterable forEach.

        hs.forEach((element) -> System.out.println(element));

        //Iteration using the for each.

        for(String s : hs){
            System.out.println(s);
        }
    }
}
