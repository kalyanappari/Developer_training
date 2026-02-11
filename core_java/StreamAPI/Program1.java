import java.util.*;
import java.util.stream.*;
public class Program1{

    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5);

        int sum = list.stream()
                         .reduce(0,(a,b)-> a + b);

        System.out.println("Sum of the numbers: " + sum);

        double avg = list.stream()
                         .collect(Collectors.averagingInt(Integer::intValue));

        System.out.println("Average of numbers: " + avg);

        int prod = list.stream()
                         .reduce(1,(a,b)-> a * b);
        
        System.out.println("Prod1 : " + prod);

        List<Integer> ans1 = list.stream()
                                 .map(num -> num * num)
                                 .toList();

        System.out.println("Square of numbers: " + ans1);

        int firstHighest = list.stream()
                         .reduce(0,(a,b)-> a > b? a : b);

        System.out.println("First Highest: " + firstHighest);

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(Arrays.asList(1,2,3,4));
        lists.add(Arrays.asList(5,6,7,8,9));

        lists.stream()
             .flatMap(obj -> obj.stream())
             .forEach(System.out::println);

    }
}