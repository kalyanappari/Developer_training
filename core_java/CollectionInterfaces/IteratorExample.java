import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Iterable;

public class IteratorExample {
    
    public static void main(String[] args) {
        
        Collection<Integer> obj = new ArrayList<>();

        obj.add(1);
        obj.add(2);
        obj.add(3);
        obj.add(4);

        Iterator<Integer> it = obj.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        //Executing the remove method.

        Iterator<Integer> it2 = obj.iterator();

        while (it2.hasNext()) {

            if(it2.next()%2 == 0){
                it2.remove();
            }
        }

        System.out.println(obj);
        
    }
}
