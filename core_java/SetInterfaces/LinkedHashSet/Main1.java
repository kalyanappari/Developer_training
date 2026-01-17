import java.util.Set;
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

        Iterator obj = hs.iterator();

        while(obj.hasNext()){
            System.out.println(obj.next());
        }
    }
}
