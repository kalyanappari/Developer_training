import java.util.TreeSet;

import java.util.NavigableSet;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Main1 {

    public static void main(String[] args){

        NavigableSet<String> set = new TreeSet<>();

        set.add("Kalyan");
        set.add("kal");
        set.add("Appari");
        set.add("Cat");
        set.add("amit");

        System.out.println(set);

        //System.out.println(set.pollFirst());

        NavigableSet<Integer> s1 = new TreeSet<>();

        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        s1.add(5);
        s1.add(6);

        System.out.println(s1);
        System.out.println(s1.pollFirst());
        System.out.println(s1);

        System.out.println(s1.pollLast());
        System.out.println(s1);


        Set<Integer> s2 = new HashSet<>();

        s2.add(11);
        s2.add(13);
        s2.add(9);
        s2.add(8);
        s2.add(10);

        s1.addAll(s2);

        System.out.println(s1);

        System.out.println(s1.ceiling(7));
        System.out.println(s1.higher(5));

        System.out.println(s1.floor(7));
        System.out.println(s1.lower(5));
        System.out.println(s1.last());
        System.out.println(s1.first());

        //Iterating through the treeset.

        //Using the iterator.

        Iterator<Integer> itr = s1.iterator();

        while(itr.hasNext()){

            System.out.print(itr.next() + " ");

        }
        System.out.println();

        //Using the descendingIterator.

        Iterator<Integer> ditr = s1.descendingIterator();

        while(ditr.hasNext()){
            System.out.print(ditr.next() + " ");
        }

        s1.remove(5);

        s1.removeAll(s2);

        System.out.println(s1);

    }
}
