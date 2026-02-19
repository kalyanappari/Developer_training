import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
public class ListIteratorExample {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(10);

        System.out.println(list.size());

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        list.add(1,1);
        System.out.println(list);

        //Iterating the list using the Iterator, ListIterator and the forEach.

        //ListIterator allows bidirectional Iteration.

        ListIterator<Integer> li = list.listIterator();

        while(li.hasNext()){
            System.out.println(li.next());
        }

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Iteration using the Iterable forEach.
        
        list.forEach((ele) -> System.out.println(ele));

    }
}
