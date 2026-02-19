import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
public class Main2 {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(null);
        hs.add(4);

        System.out.println(hs);

        //Method Operations on HashSet.

        hs.remove(null);

        hs.remove(1);

        System.out.println(hs);

        System.out.println(hs.contains(2));

        HashSet<Integer> hs2 = new HashSet<>(hs);

        System.out.println(hs2.containsAll(hs));

        hs2.add(3);

        System.out.println(hs.containsAll(hs2));
        

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        hs.addAll(list);

        System.out.println(hs);

        HashSet set = new HashSet<>();

        set = (HashSet) hs.clone();

        System.out.println(set);


    }


}
