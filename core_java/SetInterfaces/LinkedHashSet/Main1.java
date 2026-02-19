import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
public class Main1 {

    public static void main(String[] args) {
        
        Set<String> hs = new LinkedHashSet<>();

        hs.add("Kalyan");
        hs.add("kal");
        hs.add("Appari");
        hs.add("Cyber security");

        System.out.println(hs);

        hs.remove("Appari");

        System.out.println(hs);

        System.out.println(hs.getClass());

        //hs.removeAll(hs);

        System.out.println(hs);

        //Iterator.

        Iterator<String> obj = hs.iterator();

        while(obj.hasNext()){
            System.out.println(obj.next());
        }

        HashSet<String> hs1 = new HashSet<>();


        hs1.add("Nithin");
        hs1.add("Abhi");
        hs.add("Nithin");
        hs.add("Abhi");
        hs.retainAll(hs1);

        System.out.println(hs);

        //Iteration.

        hs.forEach(System.out::println);
    }
}
